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

public val FluentIcons.Filled.KeyboardLayoutSplit: ImageVector
    get() {
        if (_KeyboardLayoutSplit != null) {
            return _KeyboardLayoutSplit!!
        }
        _KeyboardLayoutSplit = ImageVector.Builder(
            name = "Filled.KeyboardLayoutSplit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.745f, 5f)
                curveTo(20.988f, 5f, 21.995f, 6.007f, 21.995f, 7.25f)
                verticalLineTo(16.755f)
                curveTo(21.995f, 17.997f, 20.988f, 19.005f, 19.745f, 19.005f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 19.005f, 2f, 17.997f, 2f, 16.755f)
                verticalLineTo(7.25f)
                curveTo(2f, 6.007f, 3.007f, 5f, 4.25f, 5f)
                horizontalLineTo(19.745f)
                close()
                moveTo(6.5f, 16f)
                horizontalLineTo(10f)
                curveTo(10.414f, 16f, 10.75f, 15.664f, 10.75f, 15.25f)
                curveTo(10.75f, 14.836f, 10.414f, 14.5f, 10f, 14.5f)
                horizontalLineTo(6.5f)
                curveTo(6.086f, 14.5f, 5.75f, 14.836f, 5.75f, 15.25f)
                curveTo(5.75f, 15.664f, 6.086f, 16f, 6.5f, 16f)
                close()
                moveTo(14f, 16f)
                horizontalLineTo(17.5f)
                curveTo(17.914f, 16f, 18.25f, 15.664f, 18.25f, 15.25f)
                curveTo(18.25f, 14.836f, 17.914f, 14.5f, 17.5f, 14.5f)
                horizontalLineTo(14f)
                curveTo(13.586f, 14.5f, 13.25f, 14.836f, 13.25f, 15.25f)
                curveTo(13.25f, 15.664f, 13.586f, 16f, 14f, 16f)
                close()
                moveTo(17.5f, 11f)
                curveTo(16.948f, 11f, 16.5f, 11.448f, 16.5f, 12f)
                curveTo(16.5f, 12.552f, 16.948f, 13f, 17.5f, 13f)
                curveTo(18.052f, 13f, 18.5f, 12.552f, 18.5f, 12f)
                curveTo(18.5f, 11.448f, 18.052f, 11f, 17.5f, 11f)
                close()
                moveTo(14.505f, 11f)
                curveTo(13.953f, 11f, 13.505f, 11.448f, 13.505f, 12f)
                curveTo(13.505f, 12.552f, 13.953f, 13f, 14.505f, 13f)
                curveTo(15.057f, 13f, 15.505f, 12.552f, 15.505f, 12f)
                curveTo(15.505f, 11.448f, 15.057f, 11f, 14.505f, 11f)
                close()
                moveTo(9.505f, 11f)
                curveTo(8.953f, 11f, 8.505f, 11.448f, 8.505f, 12f)
                curveTo(8.505f, 12.552f, 8.953f, 13f, 9.505f, 13f)
                curveTo(10.057f, 13f, 10.505f, 12.552f, 10.505f, 12f)
                curveTo(10.505f, 11.448f, 10.057f, 11f, 9.505f, 11f)
                close()
                moveTo(6.505f, 11f)
                curveTo(5.953f, 11f, 5.505f, 11.448f, 5.505f, 12f)
                curveTo(5.505f, 12.552f, 5.953f, 13f, 6.505f, 13f)
                curveTo(7.057f, 13f, 7.505f, 12.552f, 7.505f, 12f)
                curveTo(7.505f, 11.448f, 7.057f, 11f, 6.505f, 11f)
                close()
                moveTo(6f, 8f)
                curveTo(5.448f, 8f, 5f, 8.448f, 5f, 9f)
                curveTo(5f, 9.552f, 5.448f, 10f, 6f, 10f)
                curveTo(6.552f, 10f, 7f, 9.552f, 7f, 9f)
                curveTo(7f, 8.448f, 6.552f, 8f, 6f, 8f)
                close()
                moveTo(8.995f, 8f)
                curveTo(8.443f, 8f, 7.995f, 8.448f, 7.995f, 9f)
                curveTo(7.995f, 9.552f, 8.443f, 10f, 8.995f, 10f)
                curveTo(9.547f, 10f, 9.995f, 9.552f, 9.995f, 9f)
                curveTo(9.995f, 8.448f, 9.547f, 8f, 8.995f, 8f)
                close()
                moveTo(14.995f, 8f)
                curveTo(14.443f, 8f, 13.995f, 8.448f, 13.995f, 9f)
                curveTo(13.995f, 9.552f, 14.443f, 10f, 14.995f, 10f)
                curveTo(15.547f, 10f, 15.995f, 9.552f, 15.995f, 9f)
                curveTo(15.995f, 8.448f, 15.547f, 8f, 14.995f, 8f)
                close()
                moveTo(17.995f, 8f)
                curveTo(17.443f, 8f, 16.995f, 8.448f, 16.995f, 9f)
                curveTo(16.995f, 9.552f, 17.443f, 10f, 17.995f, 10f)
                curveTo(18.547f, 10f, 18.995f, 9.552f, 18.995f, 9f)
                curveTo(18.995f, 8.448f, 18.547f, 8f, 17.995f, 8f)
                close()
            }
        }.build()

        return _KeyboardLayoutSplit!!
    }

@Suppress("ObjectPropertyName")
private var _KeyboardLayoutSplit: ImageVector? = null

@Preview
@Composable
private fun KeyboardLayoutSplitPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.KeyboardLayoutSplit, contentDescription = null)
    }
}
