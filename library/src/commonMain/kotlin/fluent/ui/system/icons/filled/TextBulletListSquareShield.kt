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
 * TextBulletListSquareShield icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: text, bullet, list, square, shield
 * - Source: ic_fluent_text_bullet_list_square_shield_20_filled.svg
 * 
 * @return The [ImageVector] for the TextBulletListSquareShield icon.
 */
public val FluentIcons.Filled.TextBulletListSquareShield: ImageVector
    get() {
        if (_textBulletListSquareShield != null) {
            return _textBulletListSquareShield!!
        }
        _textBulletListSquareShield = Builder(name = "TextBulletListSquareShield", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 5.75f)
                curveTo(3.0f, 4.231f, 4.231f, 3.0f, 5.75f, 3.0f)
                horizontalLineTo(14.25f)
                curveTo(15.769f, 3.0f, 17.0f, 4.231f, 17.0f, 5.75f)
                verticalLineTo(10.417f)
                curveTo(16.486f, 10.281f, 15.983f, 9.971f, 15.476f, 9.427f)
                curveTo(15.22f, 9.153f, 14.868f, 9.002f, 14.504f, 9.0f)
                horizontalLineTo(14.494f)
                curveTo(14.13f, 9.002f, 13.778f, 9.153f, 13.522f, 9.427f)
                curveTo(13.306f, 9.659f, 13.09f, 9.848f, 12.874f, 10.0f)
                horizontalLineTo(9.5f)
                curveTo(9.224f, 10.0f, 9.0f, 10.224f, 9.0f, 10.5f)
                curveTo(9.0f, 10.776f, 9.224f, 11.0f, 9.5f, 11.0f)
                horizontalLineTo(10.309f)
                curveTo(10.112f, 11.247f, 10.0f, 11.56f, 10.0f, 11.875f)
                verticalLineTo(14.134f)
                lineTo(10.004f, 14.389f)
                lineTo(10.004f, 14.397f)
                curveTo(10.035f, 15.345f, 10.23f, 16.221f, 10.606f, 17.0f)
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
                moveTo(14.499f, 19.0f)
                curveTo(14.462f, 19.0f, 14.425f, 18.993f, 14.389f, 18.981f)
                curveTo(13.698f, 18.734f, 13.11f, 18.406f, 12.628f, 18.001f)
                lineTo(12.627f, 18.0f)
                curveTo(12.279f, 17.708f, 11.986f, 17.374f, 11.75f, 17.001f)
                lineTo(11.749f, 17.0f)
                curveTo(11.287f, 16.272f, 11.037f, 15.392f, 11.004f, 14.365f)
                lineTo(11.0f, 14.126f)
                verticalLineTo(11.875f)
                curveTo(11.0f, 11.668f, 11.157f, 11.5f, 11.35f, 11.5f)
                curveTo(12.42f, 11.5f, 13.383f, 11.042f, 14.253f, 10.11f)
                curveTo(14.321f, 10.037f, 14.41f, 10.0f, 14.499f, 10.0f)
                curveTo(14.588f, 10.0f, 14.677f, 10.037f, 14.745f, 10.11f)
                curveTo(15.615f, 11.042f, 16.578f, 11.5f, 17.648f, 11.5f)
                curveTo(17.841f, 11.5f, 17.998f, 11.668f, 17.998f, 11.875f)
                verticalLineTo(14.126f)
                lineTo(17.994f, 14.365f)
                curveTo(17.961f, 15.392f, 17.711f, 16.272f, 17.249f, 17.0f)
                lineTo(17.248f, 17.001f)
                curveTo(17.011f, 17.374f, 16.719f, 17.708f, 16.372f, 18.0f)
                lineTo(16.37f, 18.001f)
                curveTo(15.888f, 18.406f, 15.3f, 18.734f, 14.609f, 18.981f)
                curveTo(14.573f, 18.993f, 14.536f, 19.0f, 14.499f, 19.0f)
                close()
            }
        }
        .build()
        return _textBulletListSquareShield!!
    }

@Suppress("ObjectPropertyName")
private var _textBulletListSquareShield: ImageVector? = null

@Preview
@Composable
private fun TextBulletListSquareShieldPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextBulletListSquareShield, contentDescription = null)
    }
}

