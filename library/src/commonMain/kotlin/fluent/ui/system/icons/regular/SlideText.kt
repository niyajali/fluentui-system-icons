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

public val FluentIcons.Regular.SlideText: ImageVector
    get() {
        if (_SlideText != null) {
            return _SlideText!!
        }
        _SlideText = ImageVector.Builder(
            name = "Regular.SlideText",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.75f, 8f)
                curveTo(6.336f, 8f, 6f, 8.336f, 6f, 8.75f)
                curveTo(6f, 9.164f, 6.336f, 9.5f, 6.75f, 9.5f)
                horizontalLineTo(11.25f)
                curveTo(11.664f, 9.5f, 12f, 9.164f, 12f, 8.75f)
                curveTo(12f, 8.336f, 11.664f, 8f, 11.25f, 8f)
                horizontalLineTo(6.75f)
                close()
                moveTo(6f, 11.75f)
                curveTo(6f, 11.336f, 6.336f, 11f, 6.75f, 11f)
                horizontalLineTo(15.25f)
                curveTo(15.664f, 11f, 16f, 11.336f, 16f, 11.75f)
                curveTo(16f, 12.164f, 15.664f, 12.5f, 15.25f, 12.5f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 12.5f, 6f, 12.164f, 6f, 11.75f)
                close()
                moveTo(6.75f, 14f)
                curveTo(6.336f, 14f, 6f, 14.336f, 6f, 14.75f)
                curveTo(6f, 15.164f, 6.336f, 15.5f, 6.75f, 15.5f)
                horizontalLineTo(13.25f)
                curveTo(13.664f, 15.5f, 14f, 15.164f, 14f, 14.75f)
                curveTo(14f, 14.336f, 13.664f, 14f, 13.25f, 14f)
                horizontalLineTo(6.75f)
                close()
                moveTo(4.75f, 4f)
                curveTo(3.231f, 4f, 2f, 5.231f, 2f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(2f, 18.769f, 3.231f, 20f, 4.75f, 20f)
                horizontalLineTo(19.25f)
                curveTo(20.769f, 20f, 22f, 18.769f, 22f, 17.25f)
                verticalLineTo(6.75f)
                curveTo(22f, 5.231f, 20.769f, 4f, 19.25f, 4f)
                horizontalLineTo(4.75f)
                close()
                moveTo(3.5f, 6.75f)
                curveTo(3.5f, 6.06f, 4.06f, 5.5f, 4.75f, 5.5f)
                horizontalLineTo(19.25f)
                curveTo(19.94f, 5.5f, 20.5f, 6.06f, 20.5f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(20.5f, 17.94f, 19.94f, 18.5f, 19.25f, 18.5f)
                horizontalLineTo(4.75f)
                curveTo(4.06f, 18.5f, 3.5f, 17.94f, 3.5f, 17.25f)
                verticalLineTo(6.75f)
                close()
            }
        }.build()

        return _SlideText!!
    }

@Suppress("ObjectPropertyName")
private var _SlideText: ImageVector? = null

@Preview
@Composable
private fun SlideTextPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SlideText, contentDescription = null)
    }
}
