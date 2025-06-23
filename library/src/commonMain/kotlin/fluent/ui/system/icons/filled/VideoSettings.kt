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

public val FluentIcons.Filled.VideoSettings: ImageVector
    get() {
        if (_VideoSettings != null) {
            return _VideoSettings!!
        }
        _VideoSettings = ImageVector.Builder(
            name = "Filled.VideoSettings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 7.25f)
                curveTo(2f, 5.455f, 3.455f, 4f, 5.25f, 4f)
                horizontalLineTo(11.75f)
                curveTo(13.545f, 4f, 15f, 5.455f, 15f, 7.25f)
                verticalLineTo(14.75f)
                curveTo(15f, 16.104f, 14.172f, 17.264f, 12.995f, 17.753f)
                curveTo(12.998f, 17.669f, 13f, 17.585f, 13f, 17.5f)
                curveTo(13f, 13.91f, 10.09f, 11f, 6.5f, 11f)
                curveTo(4.754f, 11f, 3.168f, 11.689f, 2f, 12.81f)
                verticalLineTo(7.25f)
                close()
                moveTo(19.257f, 16.688f)
                lineTo(16f, 14.439f)
                verticalLineTo(7.562f)
                lineTo(19.257f, 5.313f)
                curveTo(20.418f, 4.511f, 22.002f, 5.342f, 22.002f, 6.753f)
                verticalLineTo(15.248f)
                curveTo(22.002f, 16.659f, 20.418f, 17.49f, 19.257f, 16.688f)
                close()
                moveTo(3.281f, 13.976f)
                lineTo(3.083f, 13.29f)
                curveTo(3.522f, 12.907f, 4.022f, 12.597f, 4.566f, 12.377f)
                lineTo(5.065f, 12.902f)
                curveTo(5.853f, 13.731f, 7.175f, 13.732f, 7.964f, 12.902f)
                lineTo(8.457f, 12.384f)
                curveTo(9.001f, 12.607f, 9.502f, 12.92f, 9.941f, 13.306f)
                lineTo(9.755f, 13.936f)
                curveTo(9.431f, 15.034f, 10.092f, 16.179f, 11.205f, 16.447f)
                lineTo(11.744f, 16.577f)
                curveTo(11.793f, 16.877f, 11.818f, 17.186f, 11.818f, 17.5f)
                curveTo(11.818f, 17.801f, 11.795f, 18.096f, 11.75f, 18.384f)
                lineTo(11.167f, 18.528f)
                curveTo(10.065f, 18.801f, 9.41f, 19.934f, 9.725f, 21.025f)
                lineTo(9.923f, 21.711f)
                curveTo(9.484f, 22.093f, 8.984f, 22.403f, 8.44f, 22.624f)
                lineTo(7.942f, 22.099f)
                curveTo(7.154f, 21.269f, 5.831f, 21.269f, 5.043f, 22.098f)
                lineTo(4.549f, 22.617f)
                curveTo(4.005f, 22.394f, 3.504f, 22.081f, 3.065f, 21.695f)
                lineTo(3.252f, 21.064f)
                curveTo(3.575f, 19.967f, 2.914f, 18.822f, 1.802f, 18.554f)
                lineTo(1.262f, 18.424f)
                curveTo(1.213f, 18.124f, 1.188f, 17.815f, 1.188f, 17.5f)
                curveTo(1.188f, 17.199f, 1.211f, 16.904f, 1.256f, 16.617f)
                lineTo(1.84f, 16.472f)
                curveTo(2.942f, 16.199f, 3.596f, 15.066f, 3.281f, 13.976f)
                close()
                moveTo(6.503f, 19f)
                curveTo(7.304f, 19f, 7.953f, 18.329f, 7.953f, 17.5f)
                curveTo(7.953f, 16.672f, 7.304f, 16f, 6.503f, 16f)
                curveTo(5.702f, 16f, 5.053f, 16.672f, 5.053f, 17.5f)
                curveTo(5.053f, 18.329f, 5.702f, 19f, 6.503f, 19f)
                close()
            }
        }.build()

        return _VideoSettings!!
    }

@Suppress("ObjectPropertyName")
private var _VideoSettings: ImageVector? = null

@Preview
@Composable
private fun VideoSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.VideoSettings, contentDescription = null)
    }
}
