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
 * GameChat icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: game, chat
 * - Source: ic_fluent_game_chat_20_regular.svg
 * 
 * @return The [ImageVector] for the GameChat icon.
 */
public val FluentIcons.Regular.GameChat: ImageVector
    get() {
        if (_gameChat != null) {
            return _gameChat!!
        }
        _gameChat = Builder(name = "GameChat", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.5f, 5.5f)
                curveTo(6.224f, 5.5f, 6.0f, 5.724f, 6.0f, 6.0f)
                curveTo(6.0f, 6.276f, 6.224f, 6.5f, 6.5f, 6.5f)
                horizontalLineTo(9.5f)
                curveTo(9.776f, 6.5f, 10.0f, 6.276f, 10.0f, 6.0f)
                curveTo(10.0f, 5.724f, 9.776f, 5.5f, 9.5f, 5.5f)
                horizontalLineTo(6.5f)
                close()
                moveTo(6.0f, 8.0f)
                curveTo(6.0f, 7.724f, 6.224f, 7.5f, 6.5f, 7.5f)
                horizontalLineTo(8.5f)
                curveTo(8.776f, 7.5f, 9.0f, 7.724f, 9.0f, 8.0f)
                curveTo(9.0f, 8.276f, 8.776f, 8.5f, 8.5f, 8.5f)
                horizontalLineTo(6.5f)
                curveTo(6.224f, 8.5f, 6.0f, 8.276f, 6.0f, 8.0f)
                close()
                moveTo(2.0f, 7.0f)
                curveTo(2.0f, 3.686f, 4.686f, 1.0f, 8.0f, 1.0f)
                curveTo(11.314f, 1.0f, 14.0f, 3.686f, 14.0f, 7.0f)
                curveTo(14.0f, 7.805f, 13.841f, 8.573f, 13.554f, 9.275f)
                curveTo(13.505f, 9.3f, 13.458f, 9.326f, 13.411f, 9.354f)
                lineTo(13.286f, 9.429f)
                curveTo(13.209f, 9.475f, 13.12f, 9.5f, 13.029f, 9.5f)
                horizontalLineTo(12.331f)
                curveTo(12.757f, 8.765f, 13.0f, 7.911f, 13.0f, 7.0f)
                curveTo(13.0f, 4.239f, 10.761f, 2.0f, 8.0f, 2.0f)
                curveTo(5.239f, 2.0f, 3.0f, 4.239f, 3.0f, 7.0f)
                curveTo(3.0f, 7.933f, 3.255f, 8.805f, 3.699f, 9.552f)
                curveTo(3.77f, 9.67f, 3.788f, 9.812f, 3.75f, 9.945f)
                lineTo(3.241f, 11.726f)
                lineTo(4.899f, 11.173f)
                curveTo(5.042f, 11.126f, 5.198f, 11.145f, 5.325f, 11.225f)
                curveTo(5.679f, 11.449f, 6.062f, 11.63f, 6.468f, 11.761f)
                lineTo(6.036f, 12.671f)
                curveTo(5.672f, 12.545f, 5.324f, 12.385f, 4.996f, 12.195f)
                lineTo(2.658f, 12.974f)
                curveTo(2.482f, 13.033f, 2.288f, 12.989f, 2.154f, 12.861f)
                curveTo(2.02f, 12.733f, 1.968f, 12.541f, 2.019f, 12.363f)
                lineTo(2.731f, 9.872f)
                curveTo(2.265f, 9.019f, 2.0f, 8.04f, 2.0f, 7.0f)
                close()
                moveTo(13.25f, 13.25f)
                curveTo(13.25f, 13.664f, 12.914f, 14.0f, 12.5f, 14.0f)
                curveTo(12.086f, 14.0f, 11.75f, 13.664f, 11.75f, 13.25f)
                curveTo(11.75f, 12.836f, 12.086f, 12.5f, 12.5f, 12.5f)
                curveTo(12.914f, 12.5f, 13.25f, 12.836f, 13.25f, 13.25f)
                close()
                moveTo(13.925f, 10.212f)
                curveTo(14.233f, 10.027f, 14.597f, 9.959f, 14.951f, 10.02f)
                lineTo(15.724f, 10.153f)
                curveTo(16.365f, 10.264f, 16.912f, 10.679f, 17.191f, 11.267f)
                lineTo(18.39f, 13.794f)
                curveTo(18.951f, 14.983f, 19.078f, 15.979f, 18.959f, 16.795f)
                curveTo(18.84f, 17.61f, 18.481f, 18.204f, 18.139f, 18.599f)
                curveTo(17.867f, 18.914f, 17.49f, 19.035f, 17.129f, 18.996f)
                curveTo(16.78f, 18.958f, 16.456f, 18.774f, 16.227f, 18.502f)
                lineTo(15.409f, 17.533f)
                curveTo(15.124f, 17.195f, 14.705f, 17.0f, 14.263f, 17.0f)
                horizontalLineTo(10.737f)
                curveTo(10.295f, 17.0f, 9.876f, 17.195f, 9.591f, 17.533f)
                lineTo(8.773f, 18.502f)
                curveTo(8.544f, 18.774f, 8.22f, 18.958f, 7.871f, 18.996f)
                curveTo(7.51f, 19.035f, 7.133f, 18.914f, 6.861f, 18.599f)
                curveTo(6.519f, 18.204f, 6.16f, 17.61f, 6.041f, 16.795f)
                curveTo(5.922f, 15.979f, 6.049f, 14.983f, 6.61f, 13.794f)
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
                moveTo(14.781f, 11.006f)
                curveTo(14.663f, 10.985f, 14.542f, 11.008f, 14.439f, 11.069f)
                lineTo(14.314f, 11.144f)
                curveTo(13.926f, 11.377f, 13.482f, 11.5f, 13.029f, 11.5f)
                horizontalLineTo(11.971f)
                curveTo(11.518f, 11.5f, 11.074f, 11.377f, 10.686f, 11.144f)
                lineTo(10.561f, 11.069f)
                curveTo(10.458f, 11.008f, 10.337f, 10.985f, 10.219f, 11.006f)
                lineTo(9.446f, 11.139f)
                curveTo(9.125f, 11.194f, 8.852f, 11.402f, 8.712f, 11.696f)
                lineTo(7.514f, 14.221f)
                curveTo(7.022f, 15.264f, 6.944f, 16.062f, 7.03f, 16.651f)
                curveTo(7.117f, 17.241f, 7.374f, 17.663f, 7.617f, 17.946f)
                curveTo(7.658f, 17.993f, 7.703f, 18.009f, 7.763f, 18.002f)
                curveTo(7.834f, 17.994f, 7.93f, 17.951f, 8.009f, 17.857f)
                lineTo(8.827f, 16.888f)
                curveTo(9.302f, 16.325f, 10.001f, 16.0f, 10.737f, 16.0f)
                horizontalLineTo(14.263f)
                curveTo(14.999f, 16.0f, 15.698f, 16.325f, 16.174f, 16.888f)
                lineTo(16.991f, 17.857f)
                curveTo(17.07f, 17.951f, 17.166f, 17.994f, 17.237f, 18.002f)
                curveTo(17.297f, 18.009f, 17.342f, 17.993f, 17.383f, 17.946f)
                curveTo(17.626f, 17.663f, 17.883f, 17.241f, 17.97f, 16.651f)
                curveTo(18.056f, 16.062f, 17.978f, 15.265f, 17.486f, 14.222f)
                lineTo(16.288f, 11.696f)
                curveTo(16.148f, 11.402f, 15.875f, 11.194f, 15.554f, 11.139f)
                lineTo(14.781f, 11.006f)
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
        Image(imageVector = FluentIcons.Regular.GameChat, contentDescription = null)
    }
}

