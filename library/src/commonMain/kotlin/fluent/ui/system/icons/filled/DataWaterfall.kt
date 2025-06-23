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

public val FluentIcons.Filled.DataWaterfall: ImageVector
    get() {
        if (_DataWaterfall != null) {
            return _DataWaterfall!!
        }
        _DataWaterfall = ImageVector.Builder(
            name = "Filled.DataWaterfall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2.75f, 3f)
                curveTo(2.336f, 3f, 2f, 3.336f, 2f, 3.75f)
                curveTo(2f, 4.164f, 2.336f, 4.5f, 2.75f, 4.5f)
                horizontalLineTo(4f)
                verticalLineTo(10.25f)
                curveTo(4f, 11.493f, 5.007f, 12.5f, 6.25f, 12.5f)
                horizontalLineTo(12.5f)
                verticalLineTo(18.75f)
                curveTo(12.5f, 19.993f, 13.507f, 21f, 14.75f, 21f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 21f, 22f, 20.664f, 22f, 20.25f)
                curveTo(22f, 19.836f, 21.664f, 19.5f, 21.25f, 19.5f)
                horizontalLineTo(20f)
                verticalLineTo(13.25f)
                curveTo(20f, 12.007f, 18.993f, 11f, 17.75f, 11f)
                horizontalLineTo(11.5f)
                verticalLineTo(5.25f)
                curveTo(11.5f, 4.007f, 10.493f, 3f, 9.25f, 3f)
                horizontalLineTo(2.75f)
                close()
            }
        }.build()

        return _DataWaterfall!!
    }

@Suppress("ObjectPropertyName")
private var _DataWaterfall: ImageVector? = null

@Preview
@Composable
private fun DataWaterfallPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DataWaterfall, contentDescription = null)
    }
}
