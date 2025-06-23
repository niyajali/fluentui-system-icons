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

public val FluentIcons.Filled.Apps: ImageVector
    get() {
        if (_Apps != null) {
            return _Apps!!
        }
        _Apps = ImageVector.Builder(
            name = "Filled.Apps",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18.492f, 2.33f)
                lineTo(21.671f, 5.509f)
                curveTo(22.55f, 6.388f, 22.55f, 7.812f, 21.671f, 8.691f)
                lineTo(19.087f, 11.275f)
                curveTo(20.17f, 11.438f, 21f, 12.372f, 21f, 13.5f)
                verticalLineTo(18.75f)
                curveTo(21f, 19.993f, 19.993f, 21f, 18.75f, 21f)
                horizontalLineTo(5.25f)
                curveTo(4.007f, 21f, 3f, 19.993f, 3f, 18.75f)
                verticalLineTo(5.25f)
                curveTo(3f, 4.007f, 4.007f, 3f, 5.25f, 3f)
                horizontalLineTo(10.5f)
                curveTo(11.629f, 3f, 12.564f, 3.831f, 12.725f, 4.915f)
                lineTo(15.31f, 2.33f)
                curveTo(16.189f, 1.452f, 17.614f, 1.452f, 18.492f, 2.33f)
                close()
                moveTo(4.5f, 18.75f)
                curveTo(4.5f, 19.164f, 4.836f, 19.5f, 5.25f, 19.5f)
                lineTo(11.249f, 19.499f)
                lineTo(11.25f, 12.75f)
                lineTo(4.5f, 12.749f)
                verticalLineTo(18.75f)
                close()
                moveTo(12.749f, 19.499f)
                lineTo(18.75f, 19.5f)
                curveTo(19.164f, 19.5f, 19.5f, 19.164f, 19.5f, 18.75f)
                verticalLineTo(13.5f)
                curveTo(19.5f, 13.086f, 19.164f, 12.75f, 18.75f, 12.75f)
                lineTo(12.749f, 12.749f)
                verticalLineTo(19.499f)
                close()
                moveTo(10.5f, 4.5f)
                horizontalLineTo(5.25f)
                curveTo(4.836f, 4.5f, 4.5f, 4.836f, 4.5f, 5.25f)
                verticalLineTo(11.249f)
                horizontalLineTo(11.25f)
                verticalLineTo(5.25f)
                curveTo(11.25f, 4.836f, 10.914f, 4.5f, 10.5f, 4.5f)
                close()
                moveTo(12.75f, 9.309f)
                verticalLineTo(11.25f)
                lineTo(14.69f, 11.249f)
                lineTo(12.75f, 9.309f)
                close()
            }
        }.build()

        return _Apps!!
    }

@Suppress("ObjectPropertyName")
private var _Apps: ImageVector? = null

@Preview
@Composable
private fun AppsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Apps, contentDescription = null)
    }
}
