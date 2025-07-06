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
 * TextBulletListSquareSettings Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_bullet_list_square_settings_20_filled.svg)
 * 
 * @return The [ImageVector] for the TextBulletListSquareSettings icon.
 */
public val FluentIcons.Filled.TextBulletListSquareSettings: ImageVector
    get() {
        if (_textBulletListSquareSettings != null) {
            return _textBulletListSquareSettings!!
        }
        _textBulletListSquareSettings = Builder(name = "TextBulletListSquareSettings", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 5.75f)
                curveTo(3.0f, 4.231f, 4.231f, 3.0f, 5.75f, 3.0f)
                horizontalLineTo(14.25f)
                curveTo(15.769f, 3.0f, 17.0f, 4.231f, 17.0f, 5.75f)
                verticalLineTo(9.6f)
                curveTo(16.25f, 9.216f, 15.4f, 9.0f, 14.5f, 9.0f)
                curveTo(13.323f, 9.0f, 12.232f, 9.37f, 11.337f, 10.0f)
                horizontalLineTo(9.5f)
                curveTo(9.224f, 10.0f, 9.0f, 10.224f, 9.0f, 10.5f)
                curveTo(9.0f, 10.776f, 9.224f, 11.0f, 9.5f, 11.0f)
                horizontalLineTo(10.257f)
                curveTo(9.472f, 11.951f, 9.0f, 13.17f, 9.0f, 14.5f)
                curveTo(9.0f, 15.4f, 9.216f, 16.25f, 9.6f, 17.0f)
                horizontalLineTo(5.75f)
                curveTo(4.231f, 17.0f, 3.0f, 15.769f, 3.0f, 14.25f)
                verticalLineTo(5.75f)
                close()
                moveTo(6.75f, 8.0f)
                curveTo(7.164f, 8.0f, 7.5f, 7.664f, 7.5f, 7.25f)
                curveTo(7.5f, 6.836f, 7.164f, 6.5f, 6.75f, 6.5f)
                curveTo(6.336f, 6.5f, 6.0f, 6.836f, 6.0f, 7.25f)
                curveTo(6.0f, 7.664f, 6.336f, 8.0f, 6.75f, 8.0f)
                close()
                moveTo(7.5f, 10.25f)
                curveTo(7.5f, 9.836f, 7.164f, 9.5f, 6.75f, 9.5f)
                curveTo(6.336f, 9.5f, 6.0f, 9.836f, 6.0f, 10.25f)
                curveTo(6.0f, 10.664f, 6.336f, 11.0f, 6.75f, 11.0f)
                curveTo(7.164f, 11.0f, 7.5f, 10.664f, 7.5f, 10.25f)
                close()
                moveTo(6.75f, 14.0f)
                curveTo(7.164f, 14.0f, 7.5f, 13.664f, 7.5f, 13.25f)
                curveTo(7.5f, 12.836f, 7.164f, 12.5f, 6.75f, 12.5f)
                curveTo(6.336f, 12.5f, 6.0f, 12.836f, 6.0f, 13.25f)
                curveTo(6.0f, 13.664f, 6.336f, 14.0f, 6.75f, 14.0f)
                close()
                moveTo(9.0f, 7.5f)
                curveTo(9.0f, 7.776f, 9.224f, 8.0f, 9.5f, 8.0f)
                horizontalLineTo(13.5f)
                curveTo(13.776f, 8.0f, 14.0f, 7.776f, 14.0f, 7.5f)
                curveTo(14.0f, 7.224f, 13.776f, 7.0f, 13.5f, 7.0f)
                horizontalLineTo(9.5f)
                curveTo(9.224f, 7.0f, 9.0f, 7.224f, 9.0f, 7.5f)
                close()
                moveTo(12.066f, 11.442f)
                curveTo(12.369f, 12.523f, 11.723f, 13.642f, 10.635f, 13.92f)
                lineTo(10.174f, 14.038f)
                curveTo(10.159f, 14.19f, 10.151f, 14.344f, 10.151f, 14.5f)
                curveTo(10.151f, 14.688f, 10.163f, 14.873f, 10.184f, 15.054f)
                lineTo(10.534f, 15.137f)
                curveTo(11.653f, 15.402f, 12.319f, 16.554f, 11.99f, 17.656f)
                lineTo(11.863f, 18.079f)
                curveTo(12.12f, 18.282f, 12.4f, 18.456f, 12.698f, 18.597f)
                lineTo(13.023f, 18.252f)
                curveTo(13.813f, 17.416f, 15.144f, 17.417f, 15.932f, 18.254f)
                lineTo(16.27f, 18.612f)
                curveTo(16.562f, 18.477f, 16.838f, 18.31f, 17.092f, 18.114f)
                lineTo(16.936f, 17.558f)
                curveTo(16.632f, 16.476f, 17.278f, 15.358f, 18.366f, 15.08f)
                lineTo(18.827f, 14.962f)
                curveTo(18.842f, 14.81f, 18.849f, 14.656f, 18.849f, 14.5f)
                curveTo(18.849f, 14.312f, 18.838f, 14.127f, 18.817f, 13.945f)
                lineTo(18.468f, 13.863f)
                curveTo(17.348f, 13.598f, 16.682f, 12.446f, 17.012f, 11.344f)
                lineTo(17.138f, 10.922f)
                curveTo(16.881f, 10.718f, 16.601f, 10.544f, 16.303f, 10.403f)
                lineTo(15.978f, 10.747f)
                curveTo(15.189f, 11.584f, 13.858f, 11.583f, 13.069f, 10.746f)
                lineTo(12.731f, 10.388f)
                curveTo(12.439f, 10.523f, 12.164f, 10.69f, 11.91f, 10.885f)
                lineTo(12.066f, 11.442f)
                close()
                moveTo(14.5f, 15.5f)
                curveTo(13.948f, 15.5f, 13.5f, 15.052f, 13.5f, 14.5f)
                curveTo(13.5f, 13.948f, 13.948f, 13.5f, 14.5f, 13.5f)
                curveTo(15.053f, 13.5f, 15.5f, 13.948f, 15.5f, 14.5f)
                curveTo(15.5f, 15.052f, 15.053f, 15.5f, 14.5f, 15.5f)
                close()
            }
        }
        .build()
        return _textBulletListSquareSettings!!
    }

@Suppress("ObjectPropertyName")
private var _textBulletListSquareSettings: ImageVector? = null

@Preview
@Composable
private fun TextBulletListSquareSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextBulletListSquareSettings, contentDescription = "TextBulletListSquareSettings Icon")
    }
}

