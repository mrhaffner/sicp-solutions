;; Exercise 2.17
;; Page 139

(defn last-pair
    [l]
    (if (empty? (rest l))
        l
        (last-pair (rest l))))