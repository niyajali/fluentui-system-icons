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
 * MailSettings icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: mail, settings
 * - Source: ic_fluent_mail_settings_20_filled.svg
 * 
 * @return The [ImageVector] for the MailSettings icon.
 */
public val FluentIcons.Filled.MailSettings: ImageVector
    get() {
        if (_mailSettings != null) {
            return _mailSettings!!
        }
        _mailSettings = Builder(name = "MailSettings", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 11.0f)
                curveTo(15.83f, 11.0f, 17.049f, 10.528f, 18.0f, 9.743f)
                verticalLineTo(14.5f)
                curveTo(18.0f, 15.881f, 16.881f, 17.0f, 15.5f, 17.0f)
                horizontalLineTo(4.5f)
                curveTo(3.119f, 17.0f, 2.0f, 15.881f, 2.0f, 14.5f)
                verticalLineTo(7.373f)
                lineTo(9.747f, 11.931f)
                curveTo(9.903f, 12.023f, 10.097f, 12.023f, 10.254f, 11.931f)
                lineTo(12.484f, 10.619f)
                curveTo(13.108f, 10.865f, 13.788f, 11.0f, 14.5f, 11.0f)
                close()
                moveTo(4.5f, 4.0f)
                horizontalLineTo(9.207f)
                curveTo(9.072f, 4.477f, 9.0f, 4.98f, 9.0f, 5.5f)
                curveTo(9.0f, 7.406f, 9.969f, 9.085f, 11.442f, 10.072f)
                lineTo(10.0f, 10.92f)
                lineTo(2.015f, 6.223f)
                curveTo(2.153f, 4.973f, 3.213f, 4.0f, 4.5f, 4.0f)
                close()
                moveTo(10.635f, 4.92f)
                curveTo(11.723f, 4.642f, 12.369f, 3.523f, 12.066f, 2.442f)
                lineTo(11.91f, 1.885f)
                curveTo(12.164f, 1.69f, 12.439f, 1.523f, 12.731f, 1.388f)
                lineTo(13.069f, 1.746f)
                curveTo(13.858f, 2.583f, 15.189f, 2.583f, 15.978f, 1.747f)
                lineTo(16.303f, 1.403f)
                curveTo(16.601f, 1.544f, 16.881f, 1.718f, 17.138f, 1.921f)
                lineTo(17.012f, 2.344f)
                curveTo(16.682f, 3.446f, 17.348f, 4.598f, 18.468f, 4.863f)
                lineTo(18.817f, 4.945f)
                curveTo(18.838f, 5.127f, 18.849f, 5.312f, 18.849f, 5.5f)
                curveTo(18.849f, 5.656f, 18.842f, 5.81f, 18.827f, 5.962f)
                lineTo(18.366f, 6.08f)
                curveTo(17.278f, 6.357f, 16.632f, 7.476f, 16.936f, 8.558f)
                lineTo(17.092f, 9.114f)
                curveTo(16.838f, 9.31f, 16.562f, 9.477f, 16.27f, 9.612f)
                lineTo(15.932f, 9.254f)
                curveTo(15.144f, 8.417f, 13.813f, 8.416f, 13.023f, 9.252f)
                lineTo(12.698f, 9.596f)
                curveTo(12.4f, 9.456f, 12.12f, 9.282f, 11.863f, 9.079f)
                lineTo(11.99f, 8.656f)
                curveTo(12.319f, 7.554f, 11.653f, 6.401f, 10.534f, 6.137f)
                lineTo(10.184f, 6.054f)
                curveTo(10.163f, 5.872f, 10.151f, 5.688f, 10.151f, 5.5f)
                curveTo(10.151f, 5.344f, 10.159f, 5.19f, 10.174f, 5.038f)
                lineTo(10.635f, 4.92f)
                close()
                moveTo(15.5f, 5.5f)
                curveTo(15.5f, 4.948f, 15.053f, 4.5f, 14.5f, 4.5f)
                curveTo(13.948f, 4.5f, 13.5f, 4.948f, 13.5f, 5.5f)
                curveTo(13.5f, 6.052f, 13.948f, 6.5f, 14.5f, 6.5f)
                curveTo(15.053f, 6.5f, 15.5f, 6.052f, 15.5f, 5.5f)
                close()
            }
        }
        .build()
        return _mailSettings!!
    }

@Suppress("ObjectPropertyName")
private var _mailSettings: ImageVector? = null

@Preview
@Composable
private fun MailSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MailSettings, contentDescription = null)
    }
}

