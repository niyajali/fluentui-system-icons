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
package fluent.ui.system.icons.regular

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

public val FluentIcons.Regular.ImageTable: ImageVector
    get() {
        if (_ImageTable != null) {
            return _ImageTable!!
        }
        _ImageTable = ImageVector.Builder(
            name = "Regular.ImageTable",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14f, 9f)
                curveTo(13.448f, 9f, 13f, 9.448f, 13f, 10f)
                curveTo(13f, 10.552f, 13.448f, 11f, 14f, 11f)
                curveTo(14.552f, 11f, 15f, 10.552f, 15f, 10f)
                curveTo(15f, 9.448f, 14.552f, 9f, 14f, 9f)
                close()
                moveTo(3f, 6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(6.25f, 4.5f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                verticalLineTo(6.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(4.5f)
                horizontalLineTo(6.25f)
                close()
                moveTo(4.5f, 16f)
                horizontalLineTo(6.5f)
                verticalLineTo(8f)
                horizontalLineTo(4.5f)
                verticalLineTo(16f)
                close()
                moveTo(16f, 6.5f)
                verticalLineTo(4.5f)
                horizontalLineTo(8f)
                verticalLineTo(6.5f)
                horizontalLineTo(16f)
                close()
                moveTo(17.5f, 6.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(6.5f)
                close()
                moveTo(17.5f, 8f)
                verticalLineTo(16f)
                horizontalLineTo(19.5f)
                verticalLineTo(8f)
                horizontalLineTo(17.5f)
                close()
                moveTo(17.5f, 17.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
                verticalLineTo(17.5f)
                horizontalLineTo(17.5f)
                close()
                moveTo(16f, 17.5f)
                horizontalLineTo(8f)
                verticalLineTo(19.5f)
                horizontalLineTo(16f)
                verticalLineTo(17.5f)
                close()
                moveTo(6.5f, 17.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(17.5f)
                close()
                moveTo(8f, 15.068f)
                lineTo(10.409f, 12.659f)
                curveTo(11.288f, 11.78f, 12.712f, 11.78f, 13.591f, 12.659f)
                lineTo(16f, 15.068f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                verticalLineTo(15.068f)
                close()
                moveTo(14.811f, 16f)
                lineTo(12.53f, 13.72f)
                curveTo(12.237f, 13.427f, 11.763f, 13.427f, 11.47f, 13.72f)
                lineTo(9.189f, 16f)
                horizontalLineTo(14.811f)
                close()
            }
        }.build()

        return _ImageTable!!
    }

@Suppress("ObjectPropertyName")
private var _ImageTable: ImageVector? = null

@Preview
@Composable
private fun ImageTablePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ImageTable, contentDescription = null)
    }
}
