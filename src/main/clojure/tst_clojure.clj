(ns tst-clojure)

(def event {:aa 1 :bb 2 :cc 3})
(def dims [:aa :cc])

; short crazy version
(prn ((apply juxt dims) event))

; more readable version, if you can call clojure 'readable'
(prn (->> event
          (filter #(some #{(first %)} dims))
          (map #(second %))
          ))
