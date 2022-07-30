;; Exercise 2.18
;; Page 140

(defn reverse
    [l]
    (defn inner-reverse
        [l l2]
            (if (empty? l)
                l2
                (inner-reverse (rest l) (cons (first l) l2))))
    (inner-reverse l []))