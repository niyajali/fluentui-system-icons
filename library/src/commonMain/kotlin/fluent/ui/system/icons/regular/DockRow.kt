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

public val FluentIcons.Regular.DockRow: ImageVector
    get() {
        if (_DockRow != null) {
            return _DockRow!!
        }
        _DockRow = ImageVector.Builder(
            name = "Regular.DockRow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.25f, 11.992f)
                curveTo(21.216f, 11.992f, 22f, 12.776f, 22f, 13.742f)
                verticalLineTo(16.242f)
                curveTo(22f, 17.209f, 21.216f, 17.992f, 20.25f, 17.992f)
                horizontalLineTo(17.75f)
                curveTo(16.784f, 17.992f, 16f, 17.209f, 16f, 16.242f)
                verticalLineTo(13.742f)
                curveTo(16f, 12.776f, 16.784f, 11.992f, 17.75f, 11.992f)
                horizontalLineTo(20.25f)
                close()
                moveTo(6.25f, 11.992f)
                curveTo(7.216f, 11.992f, 8f, 12.776f, 8f, 13.742f)
                verticalLineTo(16.242f)
                curveTo(8f, 17.209f, 7.216f, 17.992f, 6.25f, 17.992f)
                horizontalLineTo(3.75f)
                curveTo(2.783f, 17.992f, 2f, 17.209f, 2f, 16.242f)
                verticalLineTo(13.742f)
                curveTo(2f, 12.776f, 2.783f, 11.992f, 3.75f, 11.992f)
                horizontalLineTo(6.25f)
                close()
                moveTo(13.25f, 11.992f)
                curveTo(14.217f, 11.992f, 15f, 12.776f, 15f, 13.742f)
                verticalLineTo(16.242f)
                curveTo(15f, 17.209f, 14.217f, 17.992f, 13.25f, 17.992f)
                horizontalLineTo(10.75f)
                curveTo(9.783f, 17.992f, 9f, 17.209f, 9f, 16.242f)
                verticalLineTo(13.742f)
                curveTo(9f, 12.776f, 9.783f, 11.992f, 10.75f, 11.992f)
                horizontalLineTo(13.25f)
                close()
                moveTo(20.25f, 13.492f)
                horizontalLineTo(17.75f)
                curveTo(17.612f, 13.492f, 17.5f, 13.604f, 17.5f, 13.742f)
                verticalLineTo(16.242f)
                curveTo(17.5f, 16.38f, 17.612f, 16.492f, 17.75f, 16.492f)
                horizontalLineTo(20.25f)
                curveTo(20.388f, 16.492f, 20.5f, 16.38f, 20.5f, 16.242f)
                verticalLineTo(13.742f)
                curveTo(20.5f, 13.604f, 20.388f, 13.492f, 20.25f, 13.492f)
                close()
                moveTo(6.25f, 13.492f)
                horizontalLineTo(3.75f)
                curveTo(3.612f, 13.492f, 3.5f, 13.604f, 3.5f, 13.742f)
                verticalLineTo(16.242f)
                curveTo(3.5f, 16.38f, 3.612f, 16.492f, 3.75f, 16.492f)
                horizontalLineTo(6.25f)
                curveTo(6.388f, 16.492f, 6.5f, 16.38f, 6.5f, 16.242f)
                verticalLineTo(13.742f)
                curveTo(6.5f, 13.604f, 6.388f, 13.492f, 6.25f, 13.492f)
                close()
                moveTo(13.25f, 13.492f)
                horizontalLineTo(10.75f)
                curveTo(10.612f, 13.492f, 10.5f, 13.604f, 10.5f, 13.742f)
                verticalLineTo(16.242f)
                curveTo(10.5f, 16.38f, 10.612f, 16.492f, 10.75f, 16.492f)
                horizontalLineTo(13.25f)
                curveTo(13.388f, 16.492f, 13.5f, 16.38f, 13.5f, 16.242f)
                verticalLineTo(13.742f)
                curveTo(13.5f, 13.604f, 13.388f, 13.492f, 13.25f, 13.492f)
                close()
                moveTo(13.25f, 4.992f)
                curveTo(14.217f, 4.992f, 15f, 5.776f, 15f, 6.742f)
                verticalLineTo(9.242f)
                curveTo(15f, 10.209f, 14.217f, 10.992f, 13.25f, 10.992f)
                horizontalLineTo(10.75f)
                curveTo(9.783f, 10.992f, 9f, 10.209f, 9f, 9.242f)
                verticalLineTo(6.742f)
                curveTo(9f, 5.776f, 9.783f, 4.992f, 10.75f, 4.992f)
                horizontalLineTo(13.25f)
                close()
                moveTo(20.25f, 4.992f)
                curveTo(21.216f, 4.992f, 22f, 5.776f, 22f, 6.742f)
                verticalLineTo(9.242f)
                curveTo(22f, 10.209f, 21.216f, 10.992f, 20.25f, 10.992f)
                horizontalLineTo(17.75f)
                curveTo(16.784f, 10.992f, 16f, 10.209f, 16f, 9.242f)
                verticalLineTo(6.742f)
                curveTo(16f, 5.776f, 16.784f, 4.992f, 17.75f, 4.992f)
                horizontalLineTo(20.25f)
                close()
                moveTo(6.25f, 4.992f)
                curveTo(7.216f, 4.992f, 8f, 5.776f, 8f, 6.742f)
                verticalLineTo(9.242f)
                curveTo(8f, 10.209f, 7.216f, 10.992f, 6.25f, 10.992f)
                horizontalLineTo(3.75f)
                curveTo(2.783f, 10.992f, 2f, 10.209f, 2f, 9.242f)
                verticalLineTo(6.742f)
                curveTo(2f, 5.824f, 2.707f, 5.071f, 3.606f, 4.998f)
                lineTo(3.75f, 4.992f)
                horizontalLineTo(6.25f)
                close()
                moveTo(13.25f, 6.492f)
                horizontalLineTo(10.75f)
                curveTo(10.612f, 6.492f, 10.5f, 6.604f, 10.5f, 6.742f)
                verticalLineTo(9.242f)
                curveTo(10.5f, 9.38f, 10.612f, 9.492f, 10.75f, 9.492f)
                horizontalLineTo(13.25f)
                curveTo(13.388f, 9.492f, 13.5f, 9.38f, 13.5f, 9.242f)
                verticalLineTo(6.742f)
                curveTo(13.5f, 6.604f, 13.388f, 6.492f, 13.25f, 6.492f)
                close()
                moveTo(20.25f, 6.492f)
                horizontalLineTo(17.75f)
                curveTo(17.612f, 6.492f, 17.5f, 6.604f, 17.5f, 6.742f)
                verticalLineTo(9.242f)
                curveTo(17.5f, 9.38f, 17.612f, 9.492f, 17.75f, 9.492f)
                horizontalLineTo(20.25f)
                curveTo(20.388f, 9.492f, 20.5f, 9.38f, 20.5f, 9.242f)
                verticalLineTo(6.742f)
                curveTo(20.5f, 6.604f, 20.388f, 6.492f, 20.25f, 6.492f)
                close()
                moveTo(6.25f, 6.492f)
                horizontalLineTo(3.75f)
                lineTo(3.693f, 6.499f)
                curveTo(3.582f, 6.525f, 3.5f, 6.624f, 3.5f, 6.742f)
                verticalLineTo(9.242f)
                curveTo(3.5f, 9.38f, 3.612f, 9.492f, 3.75f, 9.492f)
                horizontalLineTo(6.25f)
                curveTo(6.388f, 9.492f, 6.5f, 9.38f, 6.5f, 9.242f)
                verticalLineTo(6.742f)
                curveTo(6.5f, 6.604f, 6.388f, 6.492f, 6.25f, 6.492f)
                close()
            }
        }.build()

        return _DockRow!!
    }

@Suppress("ObjectPropertyName")
private var _DockRow: ImageVector? = null

@Preview
@Composable
private fun DockRowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DockRow, contentDescription = null)
    }
}
