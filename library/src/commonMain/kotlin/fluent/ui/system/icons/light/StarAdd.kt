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
package fluent.ui.system.icons.light

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

public val FluentIcons.Light.StarAdd: ImageVector
    get() {
        if (_StarAdd != null) {
            return _StarAdd!!
        }
        _StarAdd = ImageVector.Builder(
            name = "Light.StarAdd",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.402f, 11.35f)
                curveTo(20.076f, 11.303f, 19.794f, 11.097f, 19.649f, 10.801f)
                lineTo(16.45f, 4.28f)
                curveTo(16.267f, 3.907f, 15.735f, 3.907f, 15.552f, 4.28f)
                lineTo(12.354f, 10.801f)
                curveTo(12.209f, 11.097f, 11.927f, 11.303f, 11.601f, 11.35f)
                lineTo(4.429f, 12.399f)
                curveTo(4.02f, 12.459f, 3.856f, 12.961f, 4.152f, 13.251f)
                lineTo(9.347f, 18.347f)
                curveTo(9.581f, 18.576f, 9.688f, 18.906f, 9.633f, 19.229f)
                lineTo(8.408f, 26.412f)
                curveTo(8.338f, 26.821f, 8.768f, 27.132f, 9.135f, 26.938f)
                lineTo(13.725f, 24.51f)
                curveTo(13.802f, 24.844f, 13.896f, 25.172f, 14.009f, 25.491f)
                lineTo(9.602f, 27.822f)
                curveTo(8.503f, 28.404f, 7.213f, 27.471f, 7.422f, 26.244f)
                lineTo(8.647f, 19.061f)
                lineTo(3.451f, 13.965f)
                curveTo(2.566f, 13.096f, 3.057f, 11.589f, 4.285f, 11.41f)
                lineTo(11.456f, 10.361f)
                lineTo(14.655f, 3.839f)
                curveTo(15.203f, 2.72f, 16.799f, 2.72f, 17.348f, 3.839f)
                lineTo(20.546f, 10.361f)
                lineTo(27.718f, 11.41f)
                curveTo(28.945f, 11.589f, 29.437f, 13.096f, 28.551f, 13.965f)
                lineTo(27.488f, 15.007f)
                curveTo(27.201f, 14.816f, 26.903f, 14.641f, 26.594f, 14.483f)
                lineTo(27.851f, 13.251f)
                curveTo(28.146f, 12.961f, 27.982f, 12.459f, 27.573f, 12.399f)
                lineTo(20.402f, 11.35f)
                close()
                moveTo(22.5f, 30f)
                curveTo(26.642f, 30f, 30f, 26.642f, 30f, 22.5f)
                curveTo(30f, 18.358f, 26.642f, 15f, 22.5f, 15f)
                curveTo(18.358f, 15f, 15f, 18.358f, 15f, 22.5f)
                curveTo(15f, 26.642f, 18.358f, 30f, 22.5f, 30f)
                close()
                moveTo(23.5f, 17.75f)
                verticalLineTo(21.5f)
                horizontalLineTo(27.25f)
                curveTo(27.664f, 21.5f, 28f, 21.836f, 28f, 22.25f)
                curveTo(28f, 22.664f, 27.664f, 23f, 27.25f, 23f)
                horizontalLineTo(23.5f)
                verticalLineTo(26.75f)
                curveTo(23.5f, 27.164f, 23.164f, 27.5f, 22.75f, 27.5f)
                curveTo(22.336f, 27.5f, 22f, 27.164f, 22f, 26.75f)
                verticalLineTo(23f)
                horizontalLineTo(18.25f)
                curveTo(17.836f, 23f, 17.5f, 22.664f, 17.5f, 22.25f)
                curveTo(17.5f, 21.836f, 17.836f, 21.5f, 18.25f, 21.5f)
                horizontalLineTo(22f)
                verticalLineTo(17.75f)
                curveTo(22f, 17.336f, 22.336f, 17f, 22.75f, 17f)
                curveTo(23.164f, 17f, 23.5f, 17.336f, 23.5f, 17.75f)
                close()
            }
        }.build()

        return _StarAdd!!
    }

@Suppress("ObjectPropertyName")
private var _StarAdd: ImageVector? = null

@Preview
@Composable
private fun StarAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.StarAdd, contentDescription = null)
    }
}
