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
 * VoicemailSubtract Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon, teams
 * - Description: Used to represent a voice message recording and audio playback scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_voicemail_subtract_20_regular.svg)
 * 
 * @return The [ImageVector] for the VoicemailSubtract icon.
 */
public val FluentIcons.Regular.VoicemailSubtract: ImageVector
    get() {
        if (_voicemailSubtract != null) {
            return _voicemailSubtract!!
        }
        _voicemailSubtract = Builder(name = "VoicemailSubtract", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 9.6f)
                verticalLineTo(6.0f)
                curveTo(17.0f, 5.448f, 16.552f, 5.0f, 16.0f, 5.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 5.0f, 3.0f, 5.448f, 3.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(3.0f, 14.552f, 3.448f, 15.0f, 4.0f, 15.0f)
                horizontalLineTo(9.022f)
                curveTo(9.053f, 15.343f, 9.116f, 15.678f, 9.207f, 16.0f)
                horizontalLineTo(4.0f)
                curveTo(2.895f, 16.0f, 2.0f, 15.105f, 2.0f, 14.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.895f, 2.895f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(16.0f)
                curveTo(17.105f, 4.0f, 18.0f, 4.895f, 18.0f, 6.0f)
                verticalLineTo(10.257f)
                curveTo(17.693f, 10.003f, 17.358f, 9.783f, 17.0f, 9.6f)
                close()
                moveTo(9.0f, 10.0f)
                curveTo(9.0f, 9.636f, 8.903f, 9.294f, 8.732f, 9.0f)
                horizontalLineTo(11.268f)
                curveTo(11.097f, 9.294f, 11.0f, 9.636f, 11.0f, 10.0f)
                curveTo(11.0f, 10.083f, 11.005f, 10.165f, 11.015f, 10.245f)
                curveTo(11.349f, 9.971f, 11.716f, 9.736f, 12.109f, 9.545f)
                curveTo(12.274f, 9.222f, 12.611f, 9.0f, 13.0f, 9.0f)
                curveTo(13.158f, 9.0f, 13.308f, 9.037f, 13.44f, 9.102f)
                curveTo(13.783f, 9.035f, 14.138f, 9.0f, 14.5f, 9.0f)
                curveTo(14.579f, 9.0f, 14.657f, 9.002f, 14.735f, 9.005f)
                curveTo(14.39f, 8.404f, 13.742f, 8.0f, 13.0f, 8.0f)
                horizontalLineTo(7.0f)
                curveTo(5.895f, 8.0f, 5.0f, 8.895f, 5.0f, 10.0f)
                curveTo(5.0f, 11.105f, 5.895f, 12.0f, 7.0f, 12.0f)
                curveTo(8.105f, 12.0f, 9.0f, 11.105f, 9.0f, 10.0f)
                close()
                moveTo(7.0f, 11.0f)
                curveTo(6.448f, 11.0f, 6.0f, 10.552f, 6.0f, 10.0f)
                curveTo(6.0f, 9.448f, 6.448f, 9.0f, 7.0f, 9.0f)
                curveTo(7.552f, 9.0f, 8.0f, 9.448f, 8.0f, 10.0f)
                curveTo(8.0f, 10.552f, 7.552f, 11.0f, 7.0f, 11.0f)
                close()
                moveTo(19.0f, 14.5f)
                curveTo(19.0f, 16.985f, 16.985f, 19.0f, 14.5f, 19.0f)
                curveTo(12.015f, 19.0f, 10.0f, 16.985f, 10.0f, 14.5f)
                curveTo(10.0f, 12.015f, 12.015f, 10.0f, 14.5f, 10.0f)
                curveTo(16.985f, 10.0f, 19.0f, 12.015f, 19.0f, 14.5f)
                close()
                moveTo(12.0f, 14.5f)
                curveTo(12.0f, 14.776f, 12.224f, 15.0f, 12.5f, 15.0f)
                horizontalLineTo(16.5f)
                curveTo(16.776f, 15.0f, 17.0f, 14.776f, 17.0f, 14.5f)
                curveTo(17.0f, 14.224f, 16.776f, 14.0f, 16.5f, 14.0f)
                horizontalLineTo(12.5f)
                curveTo(12.224f, 14.0f, 12.0f, 14.224f, 12.0f, 14.5f)
                close()
            }
        }
        .build()
        return _voicemailSubtract!!
    }

@Suppress("ObjectPropertyName")
private var _voicemailSubtract: ImageVector? = null

@Preview
@Composable
private fun VoicemailSubtractPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.VoicemailSubtract, contentDescription = "VoicemailSubtract Icon")
    }
}

