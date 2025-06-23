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

public val FluentIcons.Filled.TableLightning: ImageVector
    get() {
        if (_TableLightning != null) {
            return _TableLightning!!
        }
        _TableLightning = ImageVector.Builder(
            name = "Filled.TableLightning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.5f, 21f)
                horizontalLineTo(14.5f)
                verticalLineTo(20f)
                horizontalLineTo(13.498f)
                curveTo(12.399f, 20f, 11.673f, 18.857f, 12.14f, 17.862f)
                lineTo(13.016f, 16f)
                horizontalLineTo(9.5f)
                lineTo(9.5f, 21f)
                close()
                moveTo(21f, 9.5f)
                verticalLineTo(11f)
                horizontalLineTo(16.318f)
                curveTo(16.21f, 11f, 16.103f, 11.012f, 16f, 11.034f)
                verticalLineTo(9.5f)
                horizontalLineTo(21f)
                close()
                moveTo(14.5f, 9.5f)
                lineTo(14.5f, 12.842f)
                lineTo(13.72f, 14.5f)
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
                moveTo(16.317f, 12f)
                horizontalLineTo(21.144f)
                curveTo(21.527f, 12f, 21.768f, 12.412f, 21.58f, 12.745f)
                lineTo(19.749f, 16f)
                horizontalLineTo(21.245f)
                curveTo(21.89f, 16f, 22.234f, 16.759f, 21.81f, 17.244f)
                lineTo(16.986f, 22.752f)
                curveTo(16.481f, 23.328f, 15.543f, 22.837f, 15.728f, 22.094f)
                lineTo(16.499f, 19f)
                horizontalLineTo(13.497f)
                curveTo(13.13f, 19f, 12.888f, 18.619f, 13.044f, 18.287f)
                lineTo(15.864f, 12.287f)
                curveTo(15.947f, 12.112f, 16.123f, 12f, 16.317f, 12f)
                close()
            }
        }.build()

        return _TableLightning!!
    }

@Suppress("ObjectPropertyName")
private var _TableLightning: ImageVector? = null

@Preview
@Composable
private fun TableLightningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TableLightning, contentDescription = null)
    }
}
