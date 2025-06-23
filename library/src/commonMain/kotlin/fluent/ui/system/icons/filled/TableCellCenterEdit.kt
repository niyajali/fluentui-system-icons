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

public val FluentIcons.Filled.TableCellCenterEdit: ImageVector
    get() {
        if (_TableCellCenterEdit != null) {
            return _TableCellCenterEdit!!
        }
        _TableCellCenterEdit = ImageVector.Builder(
            name = "Filled.TableCellCenterEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.166f, 21f)
                horizontalLineTo(9.5f)
                lineTo(9.5f, 16f)
                horizontalLineTo(14.356f)
                lineTo(12.491f, 17.865f)
                curveTo(12.019f, 18.337f, 11.684f, 18.929f, 11.522f, 19.577f)
                lineTo(11.166f, 21f)
                close()
                moveTo(21f, 11.012f)
                verticalLineTo(9.5f)
                horizontalLineTo(16f)
                lineTo(16f, 14.356f)
                lineTo(18.394f, 11.962f)
                curveTo(19.107f, 11.249f, 20.067f, 10.932f, 21f, 11.012f)
                close()
                moveTo(21f, 6.25f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                verticalLineTo(3f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                close()
                moveTo(9.5f, 3f)
                horizontalLineTo(14.5f)
                verticalLineTo(8f)
                horizontalLineTo(9.5f)
                lineTo(9.5f, 3f)
                close()
                moveTo(6.25f, 3f)
                horizontalLineTo(8f)
                lineTo(8f, 8f)
                horizontalLineTo(3f)
                verticalLineTo(6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                close()
                moveTo(3f, 14.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(8f)
                verticalLineTo(14.5f)
                horizontalLineTo(3f)
                close()
                moveTo(3f, 17.75f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                lineTo(8f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                close()
                moveTo(19.1f, 12.67f)
                lineTo(13.197f, 18.572f)
                curveTo(12.853f, 18.916f, 12.609f, 19.347f, 12.491f, 19.819f)
                lineTo(12.033f, 21.65f)
                curveTo(11.834f, 22.446f, 12.556f, 23.167f, 13.352f, 22.968f)
                lineTo(15.182f, 22.511f)
                curveTo(15.655f, 22.393f, 16.086f, 22.149f, 16.43f, 21.804f)
                lineTo(22.332f, 15.902f)
                curveTo(23.225f, 15.009f, 23.225f, 13.562f, 22.332f, 12.67f)
                curveTo(21.44f, 11.777f, 19.993f, 11.777f, 19.1f, 12.67f)
                close()
            }
        }.build()

        return _TableCellCenterEdit!!
    }

@Suppress("ObjectPropertyName")
private var _TableCellCenterEdit: ImageVector? = null

@Preview
@Composable
private fun TableCellCenterEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TableCellCenterEdit, contentDescription = null)
    }
}
