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
 * VoicemailArrowForward icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: voicemail, arrow, forward
 * - Source: ic_fluent_voicemail_arrow_forward_20_filled.svg
 * 
 * @return The [ImageVector] for the VoicemailArrowForward icon.
 */
public val FluentIcons.Filled.VoicemailArrowForward: ImageVector
    get() {
        if (_voicemailArrowForward != null) {
            return _voicemailArrowForward!!
        }
        _voicemailArrowForward = Builder(name = "VoicemailArrowForward", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 10.0f)
                curveTo(6.0f, 9.448f, 6.448f, 9.0f, 7.0f, 9.0f)
                curveTo(7.552f, 9.0f, 8.0f, 9.448f, 8.0f, 10.0f)
                curveTo(8.0f, 10.552f, 7.552f, 11.0f, 7.0f, 11.0f)
                curveTo(6.448f, 11.0f, 6.0f, 10.552f, 6.0f, 10.0f)
                close()
                moveTo(13.0f, 8.0f)
                curveTo(13.742f, 8.0f, 14.39f, 8.404f, 14.735f, 9.005f)
                curveTo(15.973f, 9.057f, 17.105f, 9.518f, 18.0f, 10.257f)
                verticalLineTo(6.0f)
                curveTo(18.0f, 4.895f, 17.105f, 4.0f, 16.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.895f, 4.0f, 2.0f, 4.895f, 2.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(2.0f, 15.105f, 2.895f, 16.0f, 4.0f, 16.0f)
                horizontalLineTo(9.207f)
                curveTo(9.072f, 15.523f, 9.0f, 15.02f, 9.0f, 14.5f)
                curveTo(9.0f, 12.785f, 9.785f, 11.254f, 11.015f, 10.245f)
                curveTo(11.005f, 10.165f, 11.0f, 10.083f, 11.0f, 10.0f)
                curveTo(11.0f, 9.636f, 11.097f, 9.294f, 11.268f, 9.0f)
                horizontalLineTo(8.732f)
                curveTo(8.903f, 9.294f, 9.0f, 9.636f, 9.0f, 10.0f)
                curveTo(9.0f, 11.105f, 8.105f, 12.0f, 7.0f, 12.0f)
                curveTo(5.895f, 12.0f, 5.0f, 11.105f, 5.0f, 10.0f)
                curveTo(5.0f, 8.895f, 5.895f, 8.0f, 7.0f, 8.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(10.0f, 14.5f)
                curveTo(10.0f, 16.985f, 12.015f, 19.0f, 14.5f, 19.0f)
                curveTo(16.985f, 19.0f, 19.0f, 16.985f, 19.0f, 14.5f)
                curveTo(19.0f, 12.015f, 16.985f, 10.0f, 14.5f, 10.0f)
                curveTo(12.015f, 10.0f, 10.0f, 12.015f, 10.0f, 14.5f)
                close()
                moveTo(15.396f, 11.896f)
                curveTo(15.592f, 11.701f, 15.908f, 11.701f, 16.104f, 11.896f)
                lineTo(17.854f, 13.646f)
                curveTo(17.902f, 13.694f, 17.938f, 13.75f, 17.962f, 13.809f)
                curveTo(17.986f, 13.868f, 18.0f, 13.932f, 18.0f, 14.0f)
                curveTo(18.0f, 14.068f, 17.986f, 14.132f, 17.962f, 14.191f)
                curveTo(17.938f, 14.25f, 17.903f, 14.304f, 17.856f, 14.351f)
                lineTo(16.104f, 16.104f)
                curveTo(15.908f, 16.299f, 15.592f, 16.299f, 15.396f, 16.104f)
                curveTo(15.201f, 15.908f, 15.201f, 15.592f, 15.396f, 15.396f)
                lineTo(16.293f, 14.5f)
                horizontalLineTo(14.75f)
                curveTo(13.783f, 14.5f, 13.0f, 15.283f, 13.0f, 16.25f)
                verticalLineTo(16.5f)
                curveTo(13.0f, 16.776f, 12.776f, 17.0f, 12.5f, 17.0f)
                curveTo(12.224f, 17.0f, 12.0f, 16.776f, 12.0f, 16.5f)
                verticalLineTo(16.25f)
                curveTo(12.0f, 14.731f, 13.231f, 13.5f, 14.75f, 13.5f)
                horizontalLineTo(16.293f)
                lineTo(15.396f, 12.604f)
                curveTo(15.201f, 12.408f, 15.201f, 12.092f, 15.396f, 11.896f)
                close()
            }
        }
        .build()
        return _voicemailArrowForward!!
    }

@Suppress("ObjectPropertyName")
private var _voicemailArrowForward: ImageVector? = null

@Preview
@Composable
private fun VoicemailArrowForwardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.VoicemailArrowForward, contentDescription = null)
    }
}

