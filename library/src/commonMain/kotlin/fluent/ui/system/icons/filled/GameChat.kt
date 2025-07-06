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
 * GameChat Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon, xbox
 * - Description: Used to represent game chat, or in game communication generally.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_game_chat_20_filled.svg)
 * 
 * @return The [ImageVector] for the GameChat icon.
 */
public val FluentIcons.Filled.GameChat: ImageVector
    get() {
        if (_gameChat != null) {
            return _gameChat!!
        }
        _gameChat = Builder(name = "GameChat", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 7.0f)
                curveTo(2.0f, 3.686f, 4.686f, 1.0f, 8.0f, 1.0f)
                curveTo(11.314f, 1.0f, 14.0f, 3.686f, 14.0f, 7.0f)
                curveTo(14.0f, 7.805f, 13.841f, 8.573f, 13.554f, 9.275f)
                curveTo(13.505f, 9.3f, 13.458f, 9.326f, 13.411f, 9.354f)
                lineTo(13.286f, 9.429f)
                curveTo(13.209f, 9.475f, 13.12f, 9.5f, 13.029f, 9.5f)
                horizontalLineTo(11.971f)
                curveTo(11.88f, 9.5f, 11.791f, 9.475f, 11.714f, 9.429f)
                lineTo(11.589f, 9.354f)
                curveTo(11.076f, 9.046f, 10.469f, 8.933f, 9.88f, 9.035f)
                lineTo(9.107f, 9.168f)
                curveTo(8.145f, 9.333f, 7.324f, 9.957f, 6.905f, 10.838f)
                lineTo(6.036f, 12.671f)
                curveTo(5.672f, 12.545f, 5.324f, 12.385f, 4.996f, 12.195f)
                lineTo(2.658f, 12.974f)
                curveTo(2.482f, 13.033f, 2.288f, 12.989f, 2.154f, 12.861f)
                curveTo(2.02f, 12.733f, 1.968f, 12.541f, 2.019f, 12.363f)
                lineTo(2.731f, 9.872f)
                curveTo(2.265f, 9.019f, 2.0f, 8.04f, 2.0f, 7.0f)
                close()
                moveTo(6.0f, 6.0f)
                curveTo(6.0f, 6.276f, 6.224f, 6.5f, 6.5f, 6.5f)
                horizontalLineTo(9.5f)
                curveTo(9.776f, 6.5f, 10.0f, 6.276f, 10.0f, 6.0f)
                curveTo(10.0f, 5.724f, 9.776f, 5.5f, 9.5f, 5.5f)
                horizontalLineTo(6.5f)
                curveTo(6.224f, 5.5f, 6.0f, 5.724f, 6.0f, 6.0f)
                close()
                moveTo(6.5f, 7.5f)
                curveTo(6.224f, 7.5f, 6.0f, 7.724f, 6.0f, 8.0f)
                curveTo(6.0f, 8.276f, 6.224f, 8.5f, 6.5f, 8.5f)
                horizontalLineTo(8.5f)
                curveTo(8.776f, 8.5f, 9.0f, 8.276f, 9.0f, 8.0f)
                curveTo(9.0f, 7.724f, 8.776f, 7.5f, 8.5f, 7.5f)
                horizontalLineTo(6.5f)
                close()
                moveTo(14.951f, 10.02f)
                curveTo(14.597f, 9.959f, 14.233f, 10.027f, 13.925f, 10.212f)
                lineTo(13.8f, 10.287f)
                curveTo(13.567f, 10.426f, 13.301f, 10.5f, 13.029f, 10.5f)
                horizontalLineTo(11.971f)
                curveTo(11.699f, 10.5f, 11.433f, 10.426f, 11.2f, 10.287f)
                lineTo(11.075f, 10.212f)
                curveTo(10.767f, 10.027f, 10.403f, 9.959f, 10.049f, 10.02f)
                lineTo(9.276f, 10.153f)
                curveTo(8.635f, 10.264f, 8.088f, 10.679f, 7.809f, 11.267f)
                lineTo(6.61f, 13.794f)
                curveTo(6.049f, 14.983f, 5.922f, 15.979f, 6.041f, 16.795f)
                curveTo(6.16f, 17.61f, 6.519f, 18.204f, 6.861f, 18.599f)
                curveTo(7.133f, 18.914f, 7.51f, 19.035f, 7.871f, 18.996f)
                curveTo(8.22f, 18.958f, 8.544f, 18.774f, 8.773f, 18.502f)
                lineTo(9.591f, 17.533f)
                curveTo(9.876f, 17.195f, 10.295f, 17.0f, 10.737f, 17.0f)
                horizontalLineTo(14.263f)
                curveTo(14.705f, 17.0f, 15.124f, 17.195f, 15.409f, 17.533f)
                lineTo(16.227f, 18.502f)
                curveTo(16.456f, 18.774f, 16.78f, 18.958f, 17.129f, 18.996f)
                curveTo(17.49f, 19.035f, 17.867f, 18.914f, 18.139f, 18.599f)
                curveTo(18.481f, 18.204f, 18.84f, 17.61f, 18.959f, 16.795f)
                curveTo(19.078f, 15.979f, 18.951f, 14.983f, 18.39f, 13.794f)
                lineTo(17.191f, 11.267f)
                curveTo(16.912f, 10.679f, 16.365f, 10.264f, 15.724f, 10.153f)
                lineTo(14.951f, 10.02f)
                close()
                moveTo(12.5f, 14.0f)
                curveTo(12.086f, 14.0f, 11.75f, 13.664f, 11.75f, 13.25f)
                curveTo(11.75f, 12.836f, 12.086f, 12.5f, 12.5f, 12.5f)
                curveTo(12.914f, 12.5f, 13.25f, 12.836f, 13.25f, 13.25f)
                curveTo(13.25f, 13.664f, 12.914f, 14.0f, 12.5f, 14.0f)
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
        Image(imageVector = FluentIcons.Filled.GameChat, contentDescription = "GameChat Icon")
    }
}

