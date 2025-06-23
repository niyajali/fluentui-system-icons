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

public val FluentIcons.Filled.AutoFitWidth: ImageVector
    get() {
        if (_AutoFitWidth != null) {
            return _AutoFitWidth!!
        }
        _AutoFitWidth = ImageVector.Builder(
            name = "Filled.AutoFitWidth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 18f)
                curveTo(3f, 18.552f, 3.448f, 19f, 4f, 19f)
                curveTo(4.552f, 19f, 5f, 18.552f, 5f, 18f)
                verticalLineTo(6f)
                curveTo(5f, 5.448f, 4.552f, 5f, 4f, 5f)
                curveTo(3.448f, 5f, 3f, 5.448f, 3f, 6f)
                verticalLineTo(18f)
                close()
                moveTo(19f, 18f)
                curveTo(19f, 18.552f, 19.448f, 19f, 20f, 19f)
                curveTo(20.552f, 19f, 21f, 18.552f, 21f, 18f)
                verticalLineTo(6f)
                curveTo(21f, 5.448f, 20.552f, 5f, 20f, 5f)
                curveTo(19.448f, 5f, 19f, 5.448f, 19f, 6f)
                verticalLineTo(18f)
                close()
                moveTo(13.786f, 13.799f)
                lineTo(13.701f, 13.897f)
                lineTo(13.696f, 13.905f)
                curveTo(13.405f, 14.296f, 13.437f, 14.852f, 13.792f, 15.207f)
                curveTo(14.183f, 15.597f, 14.816f, 15.597f, 15.206f, 15.207f)
                lineTo(17.557f, 12.859f)
                curveTo(17.83f, 12.68f, 18f, 12.355f, 18f, 11.999f)
                curveTo(18f, 11.643f, 17.83f, 11.318f, 17.556f, 11.139f)
                lineTo(15.2f, 8.785f)
                lineTo(15.102f, 8.7f)
                lineTo(15.094f, 8.695f)
                curveTo(14.703f, 8.404f, 14.147f, 8.436f, 13.792f, 8.791f)
                lineTo(13.786f, 8.798f)
                lineTo(13.701f, 8.896f)
                lineTo(13.696f, 8.903f)
                curveTo(13.405f, 9.295f, 13.437f, 9.85f, 13.792f, 10.205f)
                lineTo(14.587f, 11f)
                horizontalLineTo(11.397f)
                lineTo(11.374f, 11.002f)
                horizontalLineTo(9.413f)
                lineTo(10.215f, 10.2f)
                lineTo(10.308f, 10.09f)
                lineTo(10.314f, 10.082f)
                curveTo(10.566f, 9.731f, 10.563f, 9.253f, 10.304f, 8.905f)
                lineTo(10.299f, 8.897f)
                lineTo(10.208f, 8.792f)
                lineTo(10.091f, 8.693f)
                lineTo(10.083f, 8.687f)
                curveTo(9.731f, 8.435f, 9.254f, 8.438f, 8.906f, 8.696f)
                lineTo(8.898f, 8.702f)
                lineTo(8.8f, 8.786f)
                lineTo(6.439f, 11.145f)
                lineTo(6.375f, 11.19f)
                lineTo(6.368f, 11.196f)
                curveTo(6.139f, 11.382f, 6f, 11.678f, 6f, 12.001f)
                curveTo(6f, 12.357f, 6.17f, 12.682f, 6.443f, 12.861f)
                lineTo(8.8f, 15.215f)
                lineTo(8.898f, 15.3f)
                lineTo(8.906f, 15.305f)
                curveTo(9.297f, 15.596f, 9.853f, 15.564f, 10.208f, 15.209f)
                curveTo(10.563f, 14.854f, 10.595f, 14.298f, 10.304f, 13.906f)
                lineTo(10.299f, 13.899f)
                lineTo(10.214f, 13.801f)
                lineTo(9.414f, 13.002f)
                horizontalLineTo(12.603f)
                lineTo(12.626f, 13f)
                horizontalLineTo(14.586f)
                lineTo(13.786f, 13.799f)
                close()
            }
        }.build()

        return _AutoFitWidth!!
    }

@Suppress("ObjectPropertyName")
private var _AutoFitWidth: ImageVector? = null

@Preview
@Composable
private fun AutoFitWidthPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.AutoFitWidth, contentDescription = null)
    }
}
