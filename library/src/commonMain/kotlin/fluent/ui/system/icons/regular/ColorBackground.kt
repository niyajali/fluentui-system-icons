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

public val FluentIcons.Regular.ColorBackground: ImageVector
    get() {
        if (_ColorBackground != null) {
            return _ColorBackground!!
        }
        _ColorBackground = ImageVector.Builder(
            name = "Regular.ColorBackground",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.342f, 12.994f)
                curveTo(11.154f, 13.403f, 11f, 13.882f, 11f, 14.375f)
                curveTo(11f, 15.11f, 11.287f, 15.801f, 11.775f, 16.289f)
                curveTo(12.21f, 16.726f, 12.806f, 17f, 13.5f, 17f)
                curveTo(14.971f, 17f, 16f, 15.766f, 16f, 14.375f)
                curveTo(16f, 13.882f, 15.846f, 13.403f, 15.658f, 12.994f)
                curveTo(15.467f, 12.579f, 15.22f, 12.188f, 14.984f, 11.86f)
                curveTo(14.747f, 11.529f, 14.511f, 11.247f, 14.335f, 11.048f)
                lineTo(14.03f, 10.72f)
                lineTo(14.028f, 10.718f)
                curveTo(13.736f, 10.427f, 13.262f, 10.427f, 12.969f, 10.72f)
                lineTo(12.964f, 10.725f)
                curveTo(12.906f, 10.787f, 12.75f, 10.951f, 12.665f, 11.048f)
                curveTo(12.489f, 11.247f, 12.253f, 11.529f, 12.016f, 11.859f)
                curveTo(11.78f, 12.188f, 11.532f, 12.578f, 11.342f, 12.994f)
                close()
                moveTo(13.766f, 12.734f)
                curveTo(13.967f, 13.015f, 14.157f, 13.32f, 14.295f, 13.62f)
                curveTo(14.435f, 13.925f, 14.5f, 14.181f, 14.5f, 14.375f)
                curveTo(14.5f, 15.066f, 14.019f, 15.5f, 13.5f, 15.5f)
                curveTo(13.249f, 15.5f, 13.008f, 15.399f, 12.825f, 15.217f)
                curveTo(12.629f, 15.022f, 12.5f, 14.733f, 12.5f, 14.375f)
                curveTo(12.5f, 14.181f, 12.565f, 13.926f, 12.705f, 13.62f)
                curveTo(12.842f, 13.32f, 13.033f, 13.015f, 13.234f, 12.734f)
                curveTo(13.324f, 12.609f, 13.414f, 12.492f, 13.5f, 12.385f)
                curveTo(13.586f, 12.492f, 13.676f, 12.609f, 13.766f, 12.734f)
                close()
                moveTo(6.75f, 1f)
                curveTo(6.335f, 1f, 6f, 1.336f, 6f, 1.75f)
                verticalLineTo(3.506f)
                curveTo(5.968f, 3.534f, 5.937f, 3.563f, 5.907f, 3.593f)
                lineTo(1.664f, 7.836f)
                curveTo(0.883f, 8.617f, 0.883f, 9.883f, 1.664f, 10.664f)
                lineTo(5.199f, 14.2f)
                curveTo(5.98f, 14.981f, 7.247f, 14.981f, 8.028f, 14.2f)
                lineTo(12.271f, 9.957f)
                curveTo(13.052f, 9.176f, 13.052f, 7.91f, 12.271f, 7.129f)
                lineTo(8.735f, 3.593f)
                curveTo(8.39f, 3.248f, 7.95f, 3.056f, 7.5f, 3.015f)
                verticalLineTo(1.75f)
                curveTo(7.5f, 1.336f, 7.164f, 1f, 6.75f, 1f)
                close()
                moveTo(6f, 5.621f)
                verticalLineTo(6.25f)
                curveTo(6f, 6.664f, 6.335f, 7f, 6.75f, 7f)
                curveTo(7.164f, 7f, 7.5f, 6.664f, 7.5f, 6.25f)
                verticalLineTo(4.54f)
                curveTo(7.563f, 4.565f, 7.623f, 4.603f, 7.674f, 4.654f)
                lineTo(11.21f, 8.189f)
                curveTo(11.297f, 8.276f, 11.345f, 8.387f, 11.354f, 8.5f)
                horizontalLineTo(3.121f)
                lineTo(6f, 5.621f)
                close()
                moveTo(6.26f, 13.139f)
                lineTo(3.132f, 10.011f)
                horizontalLineTo(10.096f)
                lineTo(6.967f, 13.139f)
                curveTo(6.772f, 13.334f, 6.455f, 13.334f, 6.26f, 13.139f)
                close()
                moveTo(2f, 17.5f)
                verticalLineTo(12.412f)
                lineTo(3.5f, 13.912f)
                verticalLineTo(17.5f)
                curveTo(3.5f, 18.052f, 3.948f, 18.5f, 4.5f, 18.5f)
                horizontalLineTo(19.5f)
                curveTo(20.052f, 18.5f, 20.5f, 18.052f, 20.5f, 17.5f)
                verticalLineTo(6.5f)
                curveTo(20.5f, 5.948f, 20.052f, 5.5f, 19.5f, 5.5f)
                horizontalLineTo(12.059f)
                lineTo(10.559f, 4f)
                horizontalLineTo(19.5f)
                curveTo(20.881f, 4f, 22f, 5.119f, 22f, 6.5f)
                verticalLineTo(17.5f)
                curveTo(22f, 18.881f, 20.881f, 20f, 19.5f, 20f)
                horizontalLineTo(4.5f)
                curveTo(3.119f, 20f, 2f, 18.881f, 2f, 17.5f)
                close()
            }
        }.build()

        return _ColorBackground!!
    }

@Suppress("ObjectPropertyName")
private var _ColorBackground: ImageVector? = null

@Preview
@Composable
private fun ColorBackgroundPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ColorBackground, contentDescription = null)
    }
}
