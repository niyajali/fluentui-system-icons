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

public val FluentIcons.Filled.VideoClipOptimize: ImageVector
    get() {
        if (_VideoClipOptimize != null) {
            return _VideoClipOptimize!!
        }
        _VideoClipOptimize = ImageVector.Builder(
            name = "Filled.VideoClipOptimize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.5f, 7.75f)
                curveTo(3.5f, 5.403f, 5.403f, 3.5f, 7.75f, 3.5f)
                horizontalLineTo(8.25f)
                curveTo(8.664f, 3.5f, 9f, 3.164f, 9f, 2.75f)
                curveTo(9f, 2.336f, 8.664f, 2f, 8.25f, 2f)
                horizontalLineTo(7.75f)
                curveTo(4.574f, 2f, 2f, 4.574f, 2f, 7.75f)
                verticalLineTo(8.25f)
                curveTo(2f, 8.664f, 2.336f, 9f, 2.75f, 9f)
                curveTo(3.164f, 9f, 3.5f, 8.664f, 3.5f, 8.25f)
                verticalLineTo(7.75f)
                close()
                moveTo(3.5f, 16.25f)
                curveTo(3.5f, 18.597f, 5.403f, 20.5f, 7.75f, 20.5f)
                horizontalLineTo(8.25f)
                curveTo(8.664f, 20.5f, 9f, 20.836f, 9f, 21.25f)
                curveTo(9f, 21.664f, 8.664f, 22f, 8.25f, 22f)
                horizontalLineTo(7.75f)
                curveTo(4.574f, 22f, 2f, 19.426f, 2f, 16.25f)
                verticalLineTo(15.75f)
                curveTo(2f, 15.336f, 2.336f, 15f, 2.75f, 15f)
                curveTo(3.164f, 15f, 3.5f, 15.336f, 3.5f, 15.75f)
                verticalLineTo(16.25f)
                close()
                moveTo(16.25f, 3.5f)
                curveTo(18.597f, 3.5f, 20.5f, 5.403f, 20.5f, 7.75f)
                verticalLineTo(8.25f)
                curveTo(20.5f, 8.664f, 20.836f, 9f, 21.25f, 9f)
                curveTo(21.664f, 9f, 22f, 8.664f, 22f, 8.25f)
                verticalLineTo(7.75f)
                curveTo(22f, 4.574f, 19.426f, 2f, 16.25f, 2f)
                horizontalLineTo(15.75f)
                curveTo(15.336f, 2f, 15f, 2.336f, 15f, 2.75f)
                curveTo(15f, 3.164f, 15.336f, 3.5f, 15.75f, 3.5f)
                horizontalLineTo(16.25f)
                close()
                moveTo(20.5f, 16.25f)
                curveTo(20.5f, 18.597f, 18.597f, 20.5f, 16.25f, 20.5f)
                horizontalLineTo(15.75f)
                curveTo(15.336f, 20.5f, 15f, 20.836f, 15f, 21.25f)
                curveTo(15f, 21.664f, 15.336f, 22f, 15.75f, 22f)
                horizontalLineTo(16.25f)
                curveTo(19.426f, 22f, 22f, 19.426f, 22f, 16.25f)
                verticalLineTo(15.75f)
                curveTo(22f, 15.336f, 21.664f, 15f, 21.25f, 15f)
                curveTo(20.836f, 15f, 20.5f, 15.336f, 20.5f, 15.75f)
                verticalLineTo(16.25f)
                close()
                moveTo(8.25f, 5f)
                curveTo(6.455f, 5f, 5f, 6.455f, 5f, 8.25f)
                verticalLineTo(15.75f)
                curveTo(5f, 17.545f, 6.455f, 19f, 8.25f, 19f)
                horizontalLineTo(15.75f)
                curveTo(17.545f, 19f, 19f, 17.545f, 19f, 15.75f)
                verticalLineTo(8.25f)
                curveTo(19f, 6.455f, 17.545f, 5f, 15.75f, 5f)
                horizontalLineTo(8.25f)
                close()
                moveTo(9f, 14.75f)
                verticalLineTo(9.251f)
                curveTo(9f, 8.49f, 9.815f, 8.008f, 10.482f, 8.374f)
                lineTo(15.481f, 11.124f)
                curveTo(16.172f, 11.504f, 16.172f, 12.497f, 15.481f, 12.877f)
                lineTo(10.482f, 15.626f)
                curveTo(9.815f, 15.993f, 9f, 15.511f, 9f, 14.75f)
                close()
            }
        }.build()

        return _VideoClipOptimize!!
    }

@Suppress("ObjectPropertyName")
private var _VideoClipOptimize: ImageVector? = null

@Preview
@Composable
private fun VideoClipOptimizePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.VideoClipOptimize, contentDescription = null)
    }
}
