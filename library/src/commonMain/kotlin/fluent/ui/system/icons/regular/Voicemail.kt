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
 * Voicemail icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: voicemail
 * - Source: ic_fluent_voicemail_24_regular.svg
 * 
 * @return The [ImageVector] for the Voicemail icon.
 */
public val FluentIcons.Regular.Voicemail: ImageVector
    get() {
        if (_voicemail != null) {
            return _voicemail!!
        }
        _voicemail = Builder(name = "Voicemail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.749f, 4.0f)
                curveTo(20.992f, 4.0f, 21.999f, 5.007f, 21.999f, 6.25f)
                verticalLineTo(17.755f)
                curveTo(21.999f, 18.997f, 20.992f, 20.005f, 19.749f, 20.005f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 20.005f, 2.0f, 18.997f, 2.0f, 17.755f)
                verticalLineTo(6.25f)
                curveTo(2.0f, 5.007f, 3.007f, 4.0f, 4.25f, 4.0f)
                horizontalLineTo(19.749f)
                close()
                moveTo(19.749f, 5.5f)
                horizontalLineTo(4.25f)
                curveTo(3.836f, 5.5f, 3.5f, 5.836f, 3.5f, 6.25f)
                verticalLineTo(17.755f)
                curveTo(3.5f, 18.169f, 3.836f, 18.505f, 4.25f, 18.505f)
                horizontalLineTo(19.749f)
                curveTo(20.163f, 18.505f, 20.499f, 18.169f, 20.499f, 17.755f)
                verticalLineTo(6.25f)
                curveTo(20.499f, 5.836f, 20.163f, 5.5f, 19.749f, 5.5f)
                close()
                moveTo(8.0f, 9.0f)
                horizontalLineTo(15.748f)
                lineTo(15.83f, 9.004f)
                lineTo(16.0f, 9.0f)
                curveTo(17.657f, 9.0f, 19.0f, 10.343f, 19.0f, 12.0f)
                curveTo(19.0f, 13.657f, 17.657f, 15.0f, 16.0f, 15.0f)
                curveTo(14.343f, 15.0f, 13.0f, 13.657f, 13.0f, 12.0f)
                curveTo(13.0f, 11.454f, 13.146f, 10.941f, 13.401f, 10.5f)
                horizontalLineTo(10.599f)
                curveTo(10.854f, 10.941f, 11.0f, 11.454f, 11.0f, 12.0f)
                curveTo(11.0f, 13.657f, 9.657f, 15.0f, 8.0f, 15.0f)
                curveTo(6.343f, 15.0f, 5.0f, 13.657f, 5.0f, 12.0f)
                curveTo(5.0f, 10.402f, 6.249f, 9.096f, 7.824f, 9.005f)
                lineTo(8.0f, 9.0f)
                close()
                moveTo(8.0f, 10.5f)
                curveTo(7.172f, 10.5f, 6.5f, 11.172f, 6.5f, 12.0f)
                curveTo(6.5f, 12.828f, 7.172f, 13.5f, 8.0f, 13.5f)
                curveTo(8.828f, 13.5f, 9.5f, 12.828f, 9.5f, 12.0f)
                curveTo(9.5f, 11.172f, 8.828f, 10.5f, 8.0f, 10.5f)
                close()
                moveTo(16.0f, 10.5f)
                curveTo(15.172f, 10.5f, 14.5f, 11.172f, 14.5f, 12.0f)
                curveTo(14.5f, 12.828f, 15.172f, 13.5f, 16.0f, 13.5f)
                curveTo(16.828f, 13.5f, 17.5f, 12.828f, 17.5f, 12.0f)
                curveTo(17.5f, 11.172f, 16.828f, 10.5f, 16.0f, 10.5f)
                close()
            }
        }
        .build()
        return _voicemail!!
    }

@Suppress("ObjectPropertyName")
private var _voicemail: ImageVector? = null

@Preview
@Composable
private fun VoicemailPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Voicemail, contentDescription = null)
    }
}

