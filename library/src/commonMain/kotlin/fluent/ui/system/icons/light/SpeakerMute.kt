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
 * SpeakerMute icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Light
 * - Size: 32dp
 * - Keywords: speaker, mute
 * - Source: ic_fluent_speaker_mute_32_light.svg
 * 
 * @return The [ImageVector] for the SpeakerMute icon.
 */
public val FluentIcons.Light.SpeakerMute: ImageVector
    get() {
        if (_speakerMute != null) {
            return _speakerMute!!
        }
        _speakerMute = Builder(name = "SpeakerMute", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.293f, 4.5f)
                curveTo(16.923f, 3.87f, 18.0f, 4.316f, 18.0f, 5.207f)
                verticalLineTo(26.793f)
                curveTo(18.0f, 27.684f, 16.923f, 28.13f, 16.293f, 27.5f)
                lineTo(11.525f, 22.733f)
                curveTo(11.057f, 22.264f, 10.421f, 22.0f, 9.758f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(3.791f, 22.0f, 2.0f, 20.209f, 2.0f, 18.0f)
                verticalLineTo(14.0f)
                curveTo(2.0f, 11.791f, 3.791f, 10.0f, 6.0f, 10.0f)
                horizontalLineTo(9.758f)
                curveTo(10.421f, 10.0f, 11.057f, 9.736f, 11.525f, 9.268f)
                lineTo(16.293f, 4.5f)
                close()
                moveTo(12.232f, 9.975f)
                curveTo(11.576f, 10.631f, 10.686f, 11.0f, 9.758f, 11.0f)
                horizontalLineTo(6.0f)
                curveTo(4.343f, 11.0f, 3.0f, 12.343f, 3.0f, 14.0f)
                verticalLineTo(18.0f)
                curveTo(3.0f, 19.657f, 4.343f, 21.0f, 6.0f, 21.0f)
                horizontalLineTo(9.758f)
                curveTo(10.686f, 21.0f, 11.576f, 21.369f, 12.232f, 22.025f)
                lineTo(17.0f, 26.793f)
                verticalLineTo(5.207f)
                lineTo(12.232f, 9.975f)
                close()
                moveTo(28.146f, 12.147f)
                curveTo(28.342f, 11.951f, 28.658f, 11.951f, 28.854f, 12.147f)
                curveTo(29.049f, 12.342f, 29.049f, 12.658f, 28.854f, 12.854f)
                lineTo(25.707f, 16.0f)
                lineTo(28.854f, 19.147f)
                lineTo(28.918f, 19.225f)
                curveTo(29.046f, 19.419f, 29.024f, 19.683f, 28.854f, 19.854f)
                curveTo(28.683f, 20.024f, 28.419f, 20.046f, 28.225f, 19.918f)
                lineTo(28.146f, 19.854f)
                lineTo(25.0f, 16.707f)
                lineTo(21.854f, 19.854f)
                lineTo(21.775f, 19.918f)
                curveTo(21.581f, 20.046f, 21.317f, 20.024f, 21.146f, 19.854f)
                curveTo(20.976f, 19.683f, 20.954f, 19.419f, 21.082f, 19.225f)
                lineTo(21.146f, 19.147f)
                lineTo(24.293f, 16.0f)
                lineTo(21.146f, 12.854f)
                curveTo(20.951f, 12.658f, 20.951f, 12.342f, 21.146f, 12.147f)
                curveTo(21.342f, 11.951f, 21.658f, 11.951f, 21.854f, 12.147f)
                lineTo(25.0f, 15.293f)
                lineTo(28.146f, 12.147f)
                close()
            }
        }
        .build()
        return _speakerMute!!
    }

@Suppress("ObjectPropertyName")
private var _speakerMute: ImageVector? = null

@Preview
@Composable
private fun SpeakerMutePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.SpeakerMute, contentDescription = null)
    }
}

