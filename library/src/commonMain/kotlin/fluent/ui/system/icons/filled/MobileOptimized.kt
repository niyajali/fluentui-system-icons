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

public val FluentIcons.Filled.MobileOptimized: ImageVector
    get() {
        if (_MobileOptimized != null) {
            return _MobileOptimized!!
        }
        _MobileOptimized = ImageVector.Builder(
            name = "Filled.MobileOptimized",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.25f, 2f)
                curveTo(5.664f, 2f, 6f, 2.336f, 6f, 2.75f)
                verticalLineTo(5.25f)
                curveTo(6f, 5.664f, 5.664f, 6f, 5.25f, 6f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 6f, 2f, 5.664f, 2f, 5.25f)
                curveTo(2f, 4.836f, 2.336f, 4.5f, 2.75f, 4.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(2.75f)
                curveTo(4.5f, 2.336f, 4.836f, 2f, 5.25f, 2f)
                close()
                moveTo(18.75f, 2f)
                curveTo(19.164f, 2f, 19.5f, 2.336f, 19.5f, 2.75f)
                verticalLineTo(4.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 4.5f, 22f, 4.836f, 22f, 5.25f)
                curveTo(22f, 5.664f, 21.664f, 6f, 21.25f, 6f)
                horizontalLineTo(18.75f)
                curveTo(18.336f, 6f, 18f, 5.664f, 18f, 5.25f)
                verticalLineTo(2.75f)
                curveTo(18f, 2.336f, 18.336f, 2f, 18.75f, 2f)
                close()
                moveTo(5.25f, 22f)
                curveTo(5.664f, 22f, 6f, 21.664f, 6f, 21.25f)
                verticalLineTo(18.75f)
                curveTo(6f, 18.336f, 5.664f, 18f, 5.25f, 18f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 18f, 2f, 18.336f, 2f, 18.75f)
                curveTo(2f, 19.164f, 2.336f, 19.5f, 2.75f, 19.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(21.25f)
                curveTo(4.5f, 21.664f, 4.836f, 22f, 5.25f, 22f)
                close()
                moveTo(18.75f, 22f)
                curveTo(19.164f, 22f, 19.5f, 21.664f, 19.5f, 21.25f)
                verticalLineTo(19.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 19.5f, 22f, 19.164f, 22f, 18.75f)
                curveTo(22f, 18.336f, 21.664f, 18f, 21.25f, 18f)
                horizontalLineTo(18.75f)
                curveTo(18.336f, 18f, 18f, 18.336f, 18f, 18.75f)
                verticalLineTo(21.25f)
                curveTo(18f, 21.664f, 18.336f, 22f, 18.75f, 22f)
                close()
                moveTo(8.5f, 6f)
                curveTo(7.672f, 6f, 7f, 6.672f, 7f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(7f, 17.328f, 7.672f, 18f, 8.5f, 18f)
                horizontalLineTo(15.5f)
                curveTo(16.328f, 18f, 17f, 17.328f, 17f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(17f, 6.672f, 16.328f, 6f, 15.5f, 6f)
                horizontalLineTo(8.5f)
                close()
                moveTo(9.5f, 10.25f)
                curveTo(9.5f, 9.836f, 9.836f, 9.5f, 10.25f, 9.5f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 9.5f, 14.5f, 9.836f, 14.5f, 10.25f)
                curveTo(14.5f, 10.664f, 14.164f, 11f, 13.75f, 11f)
                horizontalLineTo(10.25f)
                curveTo(9.836f, 11f, 9.5f, 10.664f, 9.5f, 10.25f)
                close()
                moveTo(9.5f, 13.25f)
                curveTo(9.5f, 12.836f, 9.836f, 12.5f, 10.25f, 12.5f)
                horizontalLineTo(12.25f)
                curveTo(12.664f, 12.5f, 13f, 12.836f, 13f, 13.25f)
                curveTo(13f, 13.664f, 12.664f, 14f, 12.25f, 14f)
                horizontalLineTo(10.25f)
                curveTo(9.836f, 14f, 9.5f, 13.664f, 9.5f, 13.25f)
                close()
            }
        }.build()

        return _MobileOptimized!!
    }

@Suppress("ObjectPropertyName")
private var _MobileOptimized: ImageVector? = null

@Preview
@Composable
private fun MobileOptimizedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MobileOptimized, contentDescription = null)
    }
}
