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

public val FluentIcons.Filled.TableLink: ImageVector
    get() {
        if (_TableLink != null) {
            return _TableLink!!
        }
        _TableLink = ImageVector.Builder(
            name = "Filled.TableLink",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.5f, 21f)
                horizontalLineTo(11.566f)
                curveTo(11.205f, 20.33f, 11f, 19.564f, 11f, 18.75f)
                curveTo(11f, 17.725f, 11.325f, 16.776f, 11.877f, 16f)
                horizontalLineTo(9.5f)
                lineTo(9.5f, 21f)
                close()
                moveTo(21f, 9.5f)
                verticalLineTo(14.333f)
                curveTo(20.458f, 14.118f, 19.868f, 14f, 19.25f, 14f)
                horizontalLineTo(16f)
                lineTo(16f, 9.5f)
                horizontalLineTo(21f)
                close()
                moveTo(14.5f, 9.5f)
                lineTo(14.5f, 14.166f)
                curveTo(14.196f, 14.249f, 13.903f, 14.361f, 13.626f, 14.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(14.5f)
                close()
                moveTo(21f, 8f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(21f)
                close()
                moveTo(14.5f, 3f)
                horizontalLineTo(9.5f)
                lineTo(9.5f, 8f)
                horizontalLineTo(14.5f)
                verticalLineTo(3f)
                close()
                moveTo(8f, 3f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                lineTo(8f, 3f)
                close()
                moveTo(3f, 9.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(8f)
                verticalLineTo(9.5f)
                horizontalLineTo(3f)
                close()
                moveTo(3f, 16f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(8f)
                lineTo(8f, 16f)
                horizontalLineTo(3f)
                close()
                moveTo(19.25f, 15f)
                curveTo(21.321f, 15f, 23f, 16.679f, 23f, 18.75f)
                curveTo(23f, 20.754f, 21.428f, 22.391f, 19.452f, 22.495f)
                lineTo(19.253f, 22.5f)
                verticalLineTo(22.505f)
                curveTo(18.839f, 22.507f, 18.502f, 22.172f, 18.5f, 21.758f)
                curveTo(18.498f, 21.378f, 18.779f, 21.063f, 19.145f, 21.012f)
                lineTo(19.247f, 21.005f)
                lineTo(19.25f, 21f)
                curveTo(20.493f, 21f, 21.5f, 19.993f, 21.5f, 18.75f)
                curveTo(21.5f, 17.559f, 20.575f, 16.584f, 19.404f, 16.505f)
                lineTo(19.25f, 16.5f)
                curveTo(18.836f, 16.5f, 18.5f, 16.164f, 18.5f, 15.75f)
                curveTo(18.5f, 15.37f, 18.782f, 15.057f, 19.148f, 15.007f)
                lineTo(19.25f, 15f)
                close()
                moveTo(15.75f, 15f)
                curveTo(16.164f, 15f, 16.5f, 15.336f, 16.5f, 15.75f)
                curveTo(16.5f, 16.13f, 16.218f, 16.444f, 15.852f, 16.493f)
                lineTo(15.75f, 16.5f)
                curveTo(14.507f, 16.5f, 13.5f, 17.507f, 13.5f, 18.75f)
                curveTo(13.5f, 19.941f, 14.425f, 20.916f, 15.596f, 20.995f)
                lineTo(15.75f, 21f)
                curveTo(16.164f, 21f, 16.5f, 21.336f, 16.5f, 21.75f)
                curveTo(16.5f, 22.13f, 16.218f, 22.444f, 15.852f, 22.493f)
                lineTo(15.75f, 22.5f)
                curveTo(13.679f, 22.5f, 12f, 20.821f, 12f, 18.75f)
                curveTo(12f, 16.746f, 13.572f, 15.109f, 15.551f, 15.005f)
                lineTo(15.75f, 15f)
                close()
                moveTo(19.25f, 18f)
                curveTo(19.664f, 18f, 20f, 18.336f, 20f, 18.75f)
                curveTo(20f, 19.13f, 19.718f, 19.444f, 19.352f, 19.493f)
                lineTo(19.25f, 19.5f)
                horizontalLineTo(15.75f)
                curveTo(15.336f, 19.5f, 15f, 19.164f, 15f, 18.75f)
                curveTo(15f, 18.37f, 15.282f, 18.056f, 15.648f, 18.007f)
                lineTo(15.75f, 18f)
                horizontalLineTo(19.25f)
                close()
            }
        }.build()

        return _TableLink!!
    }

@Suppress("ObjectPropertyName")
private var _TableLink: ImageVector? = null

@Preview
@Composable
private fun TableLinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TableLink, contentDescription = null)
    }
}
