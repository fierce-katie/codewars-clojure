; directions reduction
; https://www.codewars.com/kata/550f22f4d758534c1100025a

(defn reducted? [dir1 dir2]
  (or
    (and (= dir1 "NORTH") (= dir2 "SOUTH"))
    (and (= dir1 "SOUTH") (= dir2 "NORTH"))
    (and (= dir1 "EAST") (= dir2 "WEST"))
    (and (= dir1 "WEST") (= dir2 "EAST"))
  )
)

(defn dirReduc
  ([arr] (if (empty? arr) nil (dirReduc (subvec arr 1) (get arr 0))))
  ([arr fst]
    (cond
      (empty? arr) [fst]
      (reducted? (get arr 0) fst) (dirReduc (subvec arr 1))
      (< (count arr) 2) (into [fst] arr)
      (reducted? (get arr 0) (get arr 1)) (dirReduc (subvec arr 2) fst)
      :else (into [fst] (dirReduc (subvec arr 1) (get arr 0)))
    )
  )
)
