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

public val FluentIcons.Filled.Key: ImageVector
    get() {
        if (_Key != null) {
            return _Key!!
        }
        _Key = ImageVector.Builder(
            name = "Filled.Key",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.949f, 8.6f)
                curveTo(8.949f, 4.986f, 11.885f, 2.05f, 15.499f, 2.05f)
                curveTo(19.096f, 2.05f, 22.049f, 4.869f, 22.049f, 8.5f)
                curveTo(22.049f, 12.114f, 19.113f, 15.05f, 15.499f, 15.05f)
                curveTo(14.969f, 15.05f, 14.445f, 14.974f, 13.948f, 14.846f)
                curveTo(13.924f, 15.515f, 13.374f, 16.05f, 12.699f, 16.05f)
                horizontalLineTo(10.949f)
                verticalLineTo(17.8f)
                curveTo(10.949f, 18.49f, 10.39f, 19.05f, 9.699f, 19.05f)
                horizontalLineTo(7.949f)
                verticalLineTo(20.3f)
                curveTo(7.949f, 21.266f, 7.166f, 22.05f, 6.199f, 22.05f)
                horizontalLineTo(3.699f)
                curveTo(2.733f, 22.05f, 1.949f, 21.266f, 1.949f, 20.3f)
                verticalLineTo(18.128f)
                curveTo(1.949f, 17.399f, 2.239f, 16.699f, 2.755f, 16.184f)
                lineTo(8.99f, 9.948f)
                curveTo(9.045f, 9.893f, 9.077f, 9.805f, 9.06f, 9.704f)
                curveTo(8.999f, 9.36f, 8.949f, 8.987f, 8.949f, 8.6f)
                close()
                moveTo(18.249f, 7f)
                curveTo(18.249f, 6.309f, 17.69f, 5.75f, 16.999f, 5.75f)
                curveTo(16.309f, 5.75f, 15.749f, 6.309f, 15.749f, 7f)
                curveTo(15.749f, 7.69f, 16.309f, 8.25f, 16.999f, 8.25f)
                curveTo(17.69f, 8.25f, 18.249f, 7.69f, 18.249f, 7f)
                close()
            }
        }.build()

        return _Key!!
    }

@Suppress("ObjectPropertyName")
private var _Key: ImageVector? = null

@Preview
@Composable
private fun KeyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Key, contentDescription = null)
    }
}
