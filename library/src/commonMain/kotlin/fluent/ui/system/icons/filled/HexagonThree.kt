/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package fluent.ui.system.icons.filled

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.HexagonThree: ImageVector
    get() {
        if (_HexagonThree != null) {
            return _HexagonThree!!
        }
        _HexagonThree = ImageVector.Builder(
            name = "Filled.HexagonThree",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.343f, 2f)
                curveTo(5.717f, 2f, 5.14f, 2.334f, 4.827f, 2.875f)
                lineTo(3.239f, 5.625f)
                curveTo(2.927f, 6.166f, 2.927f, 6.834f, 3.239f, 7.375f)
                lineTo(4.827f, 10.125f)
                curveTo(5.14f, 10.667f, 5.717f, 11f, 6.343f, 11f)
                horizontalLineTo(9.518f)
                curveTo(10.143f, 11f, 10.721f, 10.667f, 11.034f, 10.125f)
                lineTo(12.621f, 7.375f)
                curveTo(12.934f, 6.834f, 12.934f, 6.166f, 12.621f, 5.625f)
                lineTo(11.034f, 2.875f)
                curveTo(10.721f, 2.334f, 10.143f, 2f, 9.518f, 2f)
                horizontalLineTo(6.343f)
                close()
                moveTo(4.827f, 13.875f)
                curveTo(5.14f, 13.333f, 5.717f, 13f, 6.343f, 13f)
                horizontalLineTo(9.518f)
                curveTo(10.143f, 13f, 10.721f, 13.333f, 11.034f, 13.875f)
                lineTo(12.621f, 16.625f)
                curveTo(12.934f, 17.167f, 12.934f, 17.833f, 12.621f, 18.375f)
                lineTo(11.034f, 21.125f)
                curveTo(10.721f, 21.667f, 10.143f, 22f, 9.518f, 22f)
                horizontalLineTo(6.343f)
                curveTo(5.717f, 22f, 5.14f, 21.667f, 4.827f, 21.125f)
                lineTo(3.239f, 18.375f)
                curveTo(2.927f, 17.833f, 2.927f, 17.167f, 3.239f, 16.625f)
                lineTo(4.827f, 13.875f)
                close()
                moveTo(14.327f, 8.375f)
                curveTo(14.64f, 7.834f, 15.217f, 7.5f, 15.843f, 7.5f)
                horizontalLineTo(19.018f)
                curveTo(19.643f, 7.5f, 20.221f, 7.834f, 20.534f, 8.375f)
                lineTo(22.121f, 11.125f)
                curveTo(22.434f, 11.667f, 22.434f, 12.333f, 22.121f, 12.875f)
                lineTo(20.534f, 15.625f)
                curveTo(20.221f, 16.167f, 19.643f, 16.5f, 19.018f, 16.5f)
                horizontalLineTo(15.843f)
                curveTo(15.217f, 16.5f, 14.64f, 16.167f, 14.327f, 15.625f)
                lineTo(12.739f, 12.875f)
                curveTo(12.427f, 12.333f, 12.427f, 11.667f, 12.739f, 11.125f)
                lineTo(14.327f, 8.375f)
                close()
            }
        }.build()

        return _HexagonThree!!
    }

@Suppress("ObjectPropertyName")
private var _HexagonThree: ImageVector? = null

@Preview
@Composable
private fun HexagonThreePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.HexagonThree, contentDescription = null)
    }
}
