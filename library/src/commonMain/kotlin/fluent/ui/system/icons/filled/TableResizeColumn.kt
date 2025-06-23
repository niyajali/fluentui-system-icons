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

public val FluentIcons.Filled.TableResizeColumn: ImageVector
    get() {
        if (_TableResizeColumn != null) {
            return _TableResizeColumn!!
        }
        _TableResizeColumn = ImageVector.Builder(
            name = "Filled.TableResizeColumn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.75f, 3f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(17.5f)
                verticalLineTo(14.353f)
                lineTo(18.558f, 13.163f)
                curveTo(19.147f, 12.5f, 19.147f, 11.5f, 18.558f, 10.837f)
                lineTo(17.5f, 9.647f)
                verticalLineTo(3f)
                horizontalLineTo(17.75f)
                close()
                moveTo(14.087f, 15.558f)
                curveTo(13.563f, 15.092f, 13.385f, 14.381f, 13.573f, 13.75f)
                horizontalLineTo(10.427f)
                curveTo(10.615f, 14.381f, 10.437f, 15.092f, 9.913f, 15.558f)
                curveTo(9.372f, 16.039f, 8.615f, 16.123f, 8f, 15.832f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                verticalLineTo(15.832f)
                curveTo(15.385f, 16.123f, 14.628f, 16.039f, 14.087f, 15.558f)
                close()
                moveTo(14.087f, 8.442f)
                curveTo(14.628f, 7.961f, 15.385f, 7.877f, 16f, 8.168f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                verticalLineTo(8.168f)
                curveTo(8.615f, 7.877f, 9.372f, 7.961f, 9.913f, 8.442f)
                curveTo(10.437f, 8.908f, 10.615f, 9.619f, 10.427f, 10.25f)
                horizontalLineTo(13.573f)
                curveTo(13.385f, 9.619f, 13.563f, 8.908f, 14.087f, 8.442f)
                close()
                moveTo(6.5f, 9.647f)
                verticalLineTo(3f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(6.5f)
                verticalLineTo(14.353f)
                lineTo(5.442f, 13.163f)
                curveTo(4.853f, 12.5f, 4.853f, 11.5f, 5.442f, 10.837f)
                lineTo(6.5f, 9.647f)
                close()
                moveTo(15.58f, 11.25f)
                horizontalLineTo(8.42f)
                lineTo(9.311f, 10.248f)
                curveTo(9.586f, 9.939f, 9.558f, 9.465f, 9.248f, 9.189f)
                curveTo(8.939f, 8.914f, 8.465f, 8.942f, 8.189f, 9.252f)
                lineTo(6.189f, 11.502f)
                curveTo(5.937f, 11.786f, 5.937f, 12.214f, 6.189f, 12.498f)
                lineTo(8.189f, 14.748f)
                curveTo(8.465f, 15.058f, 8.939f, 15.086f, 9.248f, 14.811f)
                curveTo(9.558f, 14.535f, 9.586f, 14.061f, 9.311f, 13.752f)
                lineTo(8.42f, 12.75f)
                horizontalLineTo(15.58f)
                lineTo(14.689f, 13.752f)
                curveTo(14.414f, 14.061f, 14.442f, 14.535f, 14.752f, 14.811f)
                curveTo(15.061f, 15.086f, 15.535f, 15.058f, 15.811f, 14.748f)
                lineTo(17.811f, 12.498f)
                curveTo(17.814f, 12.494f, 17.818f, 12.49f, 17.821f, 12.486f)
                curveTo(17.926f, 12.363f, 17.992f, 12.205f, 17.999f, 12.031f)
                curveTo(18f, 12.011f, 18f, 11.991f, 17.999f, 11.971f)
                curveTo(17.993f, 11.79f, 17.921f, 11.625f, 17.808f, 11.499f)
                lineTo(15.811f, 9.252f)
                curveTo(15.535f, 8.942f, 15.061f, 8.914f, 14.752f, 9.189f)
                curveTo(14.442f, 9.465f, 14.414f, 9.939f, 14.689f, 10.248f)
                lineTo(15.58f, 11.25f)
                close()
            }
        }.build()

        return _TableResizeColumn!!
    }

@Suppress("ObjectPropertyName")
private var _TableResizeColumn: ImageVector? = null

@Preview
@Composable
private fun TableResizeColumnPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TableResizeColumn, contentDescription = null)
    }
}
