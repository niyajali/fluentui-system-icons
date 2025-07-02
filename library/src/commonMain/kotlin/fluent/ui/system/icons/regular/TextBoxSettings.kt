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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * TextBoxSettings icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, box, settings
 * - Source: ic_fluent_textbox_settings_24_regular.svg
 * 
 * @return The [ImageVector] for the TextBoxSettings icon.
 */
public val FluentIcons.Regular.TextBoxSettings: ImageVector
    get() {
        if (_textBoxSettings != null) {
            return _textBoxSettings!!
        }
        _textBoxSettings = Builder(name = "TextBoxSettings", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.25f, 3.0f)
                curveTo(19.769f, 3.0f, 21.0f, 4.231f, 21.0f, 5.75f)
                verticalLineTo(12.022f)
                curveTo(20.537f, 11.725f, 20.034f, 11.486f, 19.5f, 11.314f)
                verticalLineTo(5.75f)
                curveTo(19.5f, 5.06f, 18.94f, 4.5f, 18.25f, 4.5f)
                horizontalLineTo(5.75f)
                curveTo(5.06f, 4.5f, 4.5f, 5.06f, 4.5f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(4.5f, 18.94f, 5.06f, 19.5f, 5.75f, 19.5f)
                horizontalLineTo(11.314f)
                curveTo(11.486f, 20.034f, 11.725f, 20.537f, 12.022f, 21.0f)
                horizontalLineTo(5.75f)
                curveTo(4.231f, 21.0f, 3.0f, 19.769f, 3.0f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(3.0f, 4.231f, 4.231f, 3.0f, 5.75f, 3.0f)
                horizontalLineTo(18.25f)
                close()
                moveTo(14.25f, 11.5f)
                curveTo(14.412f, 11.5f, 14.563f, 11.552f, 14.686f, 11.639f)
                curveTo(13.98f, 11.979f, 13.345f, 12.442f, 12.81f, 13.0f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 13.0f, 6.0f, 12.664f, 6.0f, 12.25f)
                curveTo(6.0f, 11.87f, 6.282f, 11.557f, 6.648f, 11.507f)
                lineTo(6.75f, 11.5f)
                horizontalLineTo(14.25f)
                close()
                moveTo(6.75f, 15.5f)
                horizontalLineTo(11.314f)
                curveTo(11.159f, 15.978f, 11.059f, 16.48f, 11.019f, 17.0f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 17.0f, 6.0f, 16.664f, 6.0f, 16.25f)
                curveTo(6.0f, 15.87f, 6.282f, 15.557f, 6.648f, 15.507f)
                lineTo(6.75f, 15.5f)
                close()
                moveTo(17.25f, 7.5f)
                horizontalLineTo(6.75f)
                lineTo(6.648f, 7.507f)
                curveTo(6.282f, 7.557f, 6.0f, 7.87f, 6.0f, 8.25f)
                curveTo(6.0f, 8.664f, 6.336f, 9.0f, 6.75f, 9.0f)
                horizontalLineTo(17.25f)
                lineTo(17.352f, 8.993f)
                curveTo(17.718f, 8.943f, 18.0f, 8.63f, 18.0f, 8.25f)
                curveTo(18.0f, 7.836f, 17.664f, 7.5f, 17.25f, 7.5f)
                close()
                moveTo(12.5f, 15.628f)
                lineTo(12.947f, 16.059f)
                curveTo(13.765f, 16.846f, 13.765f, 18.154f, 12.947f, 18.941f)
                lineTo(12.5f, 19.372f)
                curveTo(12.701f, 19.945f, 12.991f, 20.474f, 13.353f, 20.941f)
                lineTo(13.955f, 20.763f)
                curveTo(15.052f, 20.439f, 16.198f, 21.1f, 16.466f, 22.212f)
                lineTo(16.639f, 22.928f)
                curveTo(16.919f, 22.975f, 17.207f, 23.0f, 17.5f, 23.0f)
                curveTo(17.793f, 23.0f, 18.081f, 22.975f, 18.361f, 22.928f)
                lineTo(18.534f, 22.212f)
                curveTo(18.802f, 21.1f, 19.948f, 20.439f, 21.045f, 20.763f)
                lineTo(21.647f, 20.941f)
                curveTo(22.009f, 20.474f, 22.299f, 19.945f, 22.5f, 19.372f)
                lineTo(22.053f, 18.941f)
                curveTo(21.235f, 18.154f, 21.235f, 16.846f, 22.053f, 16.059f)
                lineTo(22.5f, 15.628f)
                curveTo(22.299f, 15.055f, 22.009f, 14.526f, 21.647f, 14.059f)
                lineTo(21.045f, 14.237f)
                curveTo(19.948f, 14.561f, 18.802f, 13.9f, 18.534f, 12.788f)
                lineTo(18.361f, 12.072f)
                curveTo(18.081f, 12.025f, 17.793f, 12.0f, 17.5f, 12.0f)
                curveTo(17.207f, 12.0f, 16.919f, 12.025f, 16.639f, 12.072f)
                lineTo(16.466f, 12.788f)
                curveTo(16.198f, 13.9f, 15.052f, 14.561f, 13.955f, 14.237f)
                lineTo(13.353f, 14.059f)
                curveTo(12.991f, 14.526f, 12.701f, 15.055f, 12.5f, 15.628f)
                close()
                moveTo(17.5f, 19.0f)
                curveTo(16.699f, 19.0f, 16.05f, 18.328f, 16.05f, 17.5f)
                curveTo(16.05f, 16.672f, 16.699f, 16.0f, 17.5f, 16.0f)
                curveTo(18.301f, 16.0f, 18.95f, 16.672f, 18.95f, 17.5f)
                curveTo(18.95f, 18.328f, 18.301f, 19.0f, 17.5f, 19.0f)
                close()
            }
        }
        .build()
        return _textBoxSettings!!
    }

@Suppress("ObjectPropertyName")
private var _textBoxSettings: ImageVector? = null

@Preview
@Composable
private fun TextBoxSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextBoxSettings, contentDescription = null)
    }
}

