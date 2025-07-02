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

package fluent.ui.system.icons.color

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Brush.Companion.radialGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
 * GameChat icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Color
 * - Size: 20dp
 * - Keywords: game, chat
 * - Source: ic_fluent_game_chat_20_color.svg
 * 
 * @return The [ImageVector] for the GameChat icon.
 */
public val FluentIcons.Color.GameChat: ImageVector
    get() {
        if (_gameChat != null) {
            return _gameChat!!
        }
        _gameChat = Builder(name = "GameChat", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFF0FAFFF), 1.0f to Color(0xFFCC23D1), start = Offset(2.429f,3.25f), end = Offset(12.905f,21.111f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 1.0f)
                curveTo(4.686f, 1.0f, 2.0f, 3.686f, 2.0f, 7.0f)
                curveTo(2.0f, 8.04f, 2.265f, 9.019f, 2.731f, 9.872f)
                lineTo(2.019f, 12.363f)
                curveTo(1.968f, 12.541f, 2.02f, 12.733f, 2.154f, 12.861f)
                curveTo(2.288f, 12.989f, 2.482f, 13.033f, 2.658f, 12.974f)
                lineTo(4.996f, 12.195f)
                curveTo(5.88f, 12.707f, 6.906f, 13.0f, 8.0f, 13.0f)
                curveTo(11.314f, 13.0f, 14.0f, 10.314f, 14.0f, 7.0f)
                curveTo(14.0f, 3.686f, 11.314f, 1.0f, 8.0f, 1.0f)
                close()
            }
            path(fill = radialGradient(0.181f to Color(0xFF1B44B1), 0.927f to Color(0x001B44B1), center = Offset(10.031f,14.344f), radius = 6.277f), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 1.0f)
                curveTo(4.686f, 1.0f, 2.0f, 3.686f, 2.0f, 7.0f)
                curveTo(2.0f, 8.04f, 2.265f, 9.019f, 2.731f, 9.872f)
                lineTo(2.019f, 12.363f)
                curveTo(1.968f, 12.541f, 2.02f, 12.733f, 2.154f, 12.861f)
                curveTo(2.288f, 12.989f, 2.482f, 13.033f, 2.658f, 12.974f)
                lineTo(4.996f, 12.195f)
                curveTo(5.88f, 12.707f, 6.906f, 13.0f, 8.0f, 13.0f)
                curveTo(11.314f, 13.0f, 14.0f, 10.314f, 14.0f, 7.0f)
                curveTo(14.0f, 3.686f, 11.314f, 1.0f, 8.0f, 1.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFDFDFD), 1.0f to Color(0xFFCCEAFF), start = Offset(6.35f,5.553f), end = Offset(6.728f,8.801f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.5f, 5.5f)
                curveTo(6.224f, 5.5f, 6.0f, 5.724f, 6.0f, 6.0f)
                curveTo(6.0f, 6.276f, 6.224f, 6.5f, 6.5f, 6.5f)
                horizontalLineTo(9.5f)
                curveTo(9.776f, 6.5f, 10.0f, 6.276f, 10.0f, 6.0f)
                curveTo(10.0f, 5.724f, 9.776f, 5.5f, 9.5f, 5.5f)
                horizontalLineTo(6.5f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFDFDFD), 1.0f to Color(0xFFCCEAFF), start = Offset(6.35f,5.553f), end = Offset(6.728f,8.801f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 8.0f)
                curveTo(6.0f, 7.724f, 6.224f, 7.5f, 6.5f, 7.5f)
                horizontalLineTo(8.5f)
                curveTo(8.776f, 7.5f, 9.0f, 7.724f, 9.0f, 8.0f)
                curveTo(9.0f, 8.276f, 8.776f, 8.5f, 8.5f, 8.5f)
                horizontalLineTo(6.5f)
                curveTo(6.224f, 8.5f, 6.0f, 8.276f, 6.0f, 8.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFB5BBCE), 0.384f to Color(0xFFA0A7BE), 1.0f to Color(0xFF728192), start = Offset(8.125f,11.375f), end = Offset(12.431f,19.552f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(13.925f, 10.212f)
                curveTo(14.233f, 10.027f, 14.597f, 9.959f, 14.951f, 10.02f)
                lineTo(15.724f, 10.153f)
                curveTo(16.365f, 10.264f, 16.912f, 10.679f, 17.191f, 11.267f)
                lineTo(18.39f, 13.794f)
                curveTo(18.951f, 14.984f, 19.078f, 15.98f, 18.959f, 16.795f)
                curveTo(18.84f, 17.61f, 18.481f, 18.204f, 18.139f, 18.6f)
                curveTo(17.867f, 18.915f, 17.49f, 19.035f, 17.129f, 18.996f)
                curveTo(16.78f, 18.958f, 16.456f, 18.774f, 16.227f, 18.502f)
                lineTo(15.409f, 17.533f)
                curveTo(15.124f, 17.195f, 14.705f, 17.0f, 14.263f, 17.0f)
                horizontalLineTo(10.737f)
                curveTo(10.295f, 17.0f, 9.876f, 17.195f, 9.591f, 17.533f)
                lineTo(8.773f, 18.502f)
                curveTo(8.544f, 18.774f, 8.22f, 18.959f, 7.871f, 18.996f)
                curveTo(7.51f, 19.035f, 7.133f, 18.915f, 6.861f, 18.6f)
                curveTo(6.519f, 18.204f, 6.16f, 17.61f, 6.041f, 16.795f)
                curveTo(5.922f, 15.98f, 6.049f, 14.984f, 6.61f, 13.794f)
                lineTo(6.61f, 13.793f)
                lineTo(7.809f, 11.267f)
                curveTo(8.088f, 10.679f, 8.635f, 10.264f, 9.276f, 10.153f)
                lineTo(10.049f, 10.02f)
                curveTo(10.403f, 9.959f, 10.767f, 10.027f, 11.075f, 10.212f)
                lineTo(11.2f, 10.287f)
                curveTo(11.433f, 10.426f, 11.699f, 10.5f, 11.971f, 10.5f)
                horizontalLineTo(13.029f)
                curveTo(13.301f, 10.5f, 13.567f, 10.426f, 13.8f, 10.287f)
                lineTo(13.925f, 10.212f)
                close()
            }
            path(fill = SolidColor(Color(0xFF3E3E3E)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.25f, 13.25f)
                curveTo(13.25f, 13.664f, 12.914f, 14.0f, 12.5f, 14.0f)
                curveTo(12.086f, 14.0f, 11.75f, 13.664f, 11.75f, 13.25f)
                curveTo(11.75f, 12.836f, 12.086f, 12.5f, 12.5f, 12.5f)
                curveTo(12.914f, 12.5f, 13.25f, 12.836f, 13.25f, 13.25f)
                close()
            }
        }
        .build()
        return _gameChat!!
    }

@Suppress("ObjectPropertyName")
private var _gameChat: ImageVector? = null

@Preview
@Composable
private fun GameChatPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Color.GameChat, contentDescription = null)
    }
}

