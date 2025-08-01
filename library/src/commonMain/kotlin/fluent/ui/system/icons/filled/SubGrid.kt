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

public val FluentIcons.Filled.SubGrid: ImageVector
    get() {
        if (_SubGrid != null) {
            return _SubGrid!!
        }
        _SubGrid = ImageVector.Builder(
            name = "Filled.SubGrid",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 3f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(6.25f)
                close()
                moveTo(4.5f, 6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(11.25f)
                verticalLineTo(7f)
                horizontalLineTo(9.75f)
                curveTo(8.231f, 7f, 7f, 8.231f, 7f, 9.75f)
                verticalLineTo(11.25f)
                horizontalLineTo(4.5f)
                verticalLineTo(6.25f)
                close()
                moveTo(7f, 12.75f)
                verticalLineTo(11.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(7f)
                horizontalLineTo(12.75f)
                verticalLineTo(11.25f)
                horizontalLineTo(17f)
                verticalLineTo(12.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(17f)
                horizontalLineTo(11.25f)
                verticalLineTo(12.75f)
                horizontalLineTo(7f)
                close()
                moveTo(7f, 12.75f)
                verticalLineTo(14.25f)
                curveTo(7f, 15.769f, 8.231f, 17f, 9.75f, 17f)
                horizontalLineTo(11.25f)
                verticalLineTo(19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(12.75f)
                horizontalLineTo(7f)
                close()
                moveTo(12.75f, 17f)
                horizontalLineTo(14.25f)
                curveTo(15.769f, 17f, 17f, 15.769f, 17f, 14.25f)
                verticalLineTo(12.75f)
                horizontalLineTo(19.5f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(17f)
                close()
                moveTo(17f, 11.25f)
                verticalLineTo(9.75f)
                curveTo(17f, 8.231f, 15.769f, 7f, 14.25f, 7f)
                horizontalLineTo(12.75f)
                verticalLineTo(4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                verticalLineTo(11.25f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _SubGrid!!
    }

@Suppress("ObjectPropertyName")
private var _SubGrid: ImageVector? = null

@Preview
@Composable
private fun SubGridPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SubGrid, contentDescription = null)
    }
}
