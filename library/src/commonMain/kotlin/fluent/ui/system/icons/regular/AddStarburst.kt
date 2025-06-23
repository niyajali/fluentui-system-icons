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

public val FluentIcons.Regular.AddStarburst: ImageVector
    get() {
        if (_AddStarburst != null) {
            return _AddStarburst!!
        }
        _AddStarburst = ImageVector.Builder(
            name = "Regular.AddStarburst",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.75f, 7.75f)
                curveTo(12.75f, 7.336f, 12.414f, 7f, 12f, 7f)
                curveTo(11.586f, 7f, 11.25f, 7.336f, 11.25f, 7.75f)
                verticalLineTo(11.25f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 11.25f, 7f, 11.586f, 7f, 12f)
                curveTo(7f, 12.414f, 7.336f, 12.75f, 7.75f, 12.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(16.25f)
                curveTo(11.25f, 16.664f, 11.586f, 17f, 12f, 17f)
                curveTo(12.414f, 17f, 12.75f, 16.664f, 12.75f, 16.25f)
                verticalLineTo(12.75f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 12.75f, 17f, 12.414f, 17f, 12f)
                curveTo(17f, 11.586f, 16.664f, 11.25f, 16.25f, 11.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(7.75f)
                close()
                moveTo(12.792f, 1.383f)
                curveTo(12.392f, 0.868f, 11.613f, 0.868f, 11.213f, 1.383f)
                lineTo(9.8f, 3.199f)
                curveTo(9.732f, 3.288f, 9.613f, 3.32f, 9.509f, 3.278f)
                lineTo(7.377f, 2.411f)
                curveTo(6.773f, 2.165f, 6.1f, 2.554f, 6.01f, 3.2f)
                lineTo(5.695f, 5.48f)
                curveTo(5.68f, 5.59f, 5.592f, 5.678f, 5.482f, 5.693f)
                lineTo(3.202f, 6.008f)
                curveTo(2.556f, 6.098f, 2.167f, 6.771f, 2.413f, 7.375f)
                lineTo(3.28f, 9.507f)
                curveTo(3.322f, 9.611f, 3.29f, 9.73f, 3.201f, 9.798f)
                lineTo(1.385f, 11.211f)
                curveTo(0.87f, 11.611f, 0.87f, 12.389f, 1.385f, 12.79f)
                lineTo(3.201f, 14.203f)
                curveTo(3.29f, 14.271f, 3.322f, 14.39f, 3.28f, 14.494f)
                lineTo(2.413f, 16.626f)
                curveTo(2.167f, 17.23f, 2.556f, 17.903f, 3.202f, 17.993f)
                lineTo(5.482f, 18.308f)
                curveTo(5.592f, 18.323f, 5.68f, 18.41f, 5.695f, 18.521f)
                lineTo(6.01f, 20.801f)
                curveTo(6.1f, 21.447f, 6.773f, 21.836f, 7.377f, 21.59f)
                lineTo(9.509f, 20.723f)
                curveTo(9.613f, 20.681f, 9.732f, 20.713f, 9.8f, 20.802f)
                lineTo(11.213f, 22.618f)
                curveTo(11.613f, 23.133f, 12.392f, 23.133f, 12.792f, 22.618f)
                lineTo(14.205f, 20.802f)
                curveTo(14.273f, 20.713f, 14.392f, 20.681f, 14.496f, 20.723f)
                lineTo(16.628f, 21.59f)
                curveTo(17.232f, 21.836f, 17.905f, 21.447f, 17.995f, 20.801f)
                lineTo(18.31f, 18.521f)
                curveTo(18.325f, 18.41f, 18.413f, 18.323f, 18.523f, 18.308f)
                lineTo(20.803f, 17.993f)
                curveTo(21.449f, 17.903f, 21.838f, 17.23f, 21.592f, 16.626f)
                lineTo(20.725f, 14.494f)
                curveTo(20.683f, 14.39f, 20.715f, 14.271f, 20.803f, 14.203f)
                lineTo(22.62f, 12.79f)
                curveTo(23.135f, 12.389f, 23.135f, 11.611f, 22.62f, 11.211f)
                lineTo(20.803f, 9.798f)
                curveTo(20.715f, 9.73f, 20.683f, 9.611f, 20.725f, 9.507f)
                lineTo(21.592f, 7.375f)
                curveTo(21.838f, 6.771f, 21.449f, 6.098f, 20.803f, 6.008f)
                lineTo(18.523f, 5.693f)
                curveTo(18.413f, 5.678f, 18.325f, 5.59f, 18.31f, 5.48f)
                lineTo(17.995f, 3.2f)
                curveTo(17.905f, 2.554f, 17.232f, 2.165f, 16.628f, 2.411f)
                lineTo(14.496f, 3.278f)
                curveTo(14.392f, 3.32f, 14.273f, 3.288f, 14.205f, 3.199f)
                lineTo(12.792f, 1.383f)
                close()
                moveTo(10.984f, 4.12f)
                lineTo(12.002f, 2.811f)
                lineTo(13.02f, 4.12f)
                curveTo(13.502f, 4.739f, 14.335f, 4.962f, 15.061f, 4.667f)
                lineTo(16.597f, 4.043f)
                lineTo(16.824f, 5.685f)
                curveTo(16.931f, 6.461f, 17.542f, 7.071f, 18.318f, 7.179f)
                lineTo(19.96f, 7.406f)
                lineTo(19.336f, 8.942f)
                curveTo(19.041f, 9.668f, 19.264f, 10.502f, 19.883f, 10.983f)
                lineTo(21.191f, 12f)
                lineTo(19.883f, 13.019f)
                curveTo(19.264f, 13.5f, 19.041f, 14.333f, 19.336f, 15.059f)
                lineTo(19.96f, 16.595f)
                lineTo(18.318f, 16.822f)
                curveTo(17.542f, 16.93f, 16.931f, 17.54f, 16.824f, 18.316f)
                lineTo(16.597f, 19.958f)
                lineTo(15.061f, 19.334f)
                curveTo(14.335f, 19.039f, 13.502f, 19.262f, 13.02f, 19.881f)
                lineTo(12.002f, 21.19f)
                lineTo(10.984f, 19.881f)
                curveTo(10.503f, 19.262f, 9.67f, 19.039f, 8.944f, 19.334f)
                lineTo(7.408f, 19.958f)
                lineTo(7.181f, 18.316f)
                curveTo(7.073f, 17.54f, 6.463f, 16.93f, 5.687f, 16.822f)
                lineTo(4.045f, 16.595f)
                lineTo(4.669f, 15.059f)
                curveTo(4.964f, 14.333f, 4.741f, 13.5f, 4.122f, 13.019f)
                lineTo(2.813f, 12f)
                lineTo(4.122f, 10.983f)
                curveTo(4.741f, 10.502f, 4.964f, 9.668f, 4.669f, 8.942f)
                lineTo(4.045f, 7.406f)
                lineTo(5.687f, 7.179f)
                curveTo(6.463f, 7.071f, 7.073f, 6.461f, 7.181f, 5.685f)
                lineTo(7.408f, 4.043f)
                lineTo(8.944f, 4.667f)
                curveTo(9.67f, 4.962f, 10.503f, 4.739f, 10.984f, 4.12f)
                close()
            }
        }.build()

        return _AddStarburst!!
    }

@Suppress("ObjectPropertyName")
private var _AddStarburst: ImageVector? = null

@Preview
@Composable
private fun AddStarburstPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.AddStarburst, contentDescription = null)
    }
}
