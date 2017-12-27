(ns tst-clojure)

(def event {:aa 1 :bb 2 :cc 3})
(def dims [:aa :cc])

(prn ((apply juxt dims) event))

(prn (->> event
          (filter #(some #{(first %)} dims))
          (map #(second %))
          ))
