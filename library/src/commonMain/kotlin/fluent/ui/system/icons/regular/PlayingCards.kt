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
 * PlayingCards Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon, teams
 * - Description: Used to represent fun card games.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_playing_cards_20_regular.svg)
 * 
 * @return The [ImageVector] for the PlayingCards icon.
 */
public val FluentIcons.Regular.PlayingCards: ImageVector
    get() {
        if (_playingCards != null) {
            return _playingCards!!
        }
        _playingCards = Builder(name = "PlayingCards", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.068f, 13.009f)
                curveTo(4.783f, 14.076f, 5.417f, 15.174f, 6.484f, 15.461f)
                lineTo(11.944f, 16.931f)
                curveTo(13.011f, 17.218f, 14.106f, 16.585f, 14.391f, 15.518f)
                lineTo(16.932f, 5.995f)
                curveTo(17.216f, 4.928f, 16.583f, 3.83f, 15.516f, 3.543f)
                lineTo(10.055f, 2.074f)
                curveTo(8.989f, 1.787f, 7.893f, 2.419f, 7.608f, 3.486f)
                lineTo(5.068f, 13.009f)
                close()
                moveTo(6.741f, 14.495f)
                curveTo(6.208f, 14.352f, 5.891f, 13.803f, 6.034f, 13.269f)
                lineTo(8.574f, 3.746f)
                curveTo(8.716f, 3.213f, 9.264f, 2.896f, 9.797f, 3.04f)
                lineTo(15.258f, 4.509f)
                curveTo(15.791f, 4.653f, 16.108f, 5.202f, 15.966f, 5.736f)
                lineTo(13.425f, 15.258f)
                curveTo(13.283f, 15.792f, 12.735f, 16.108f, 12.202f, 15.965f)
                lineTo(6.741f, 14.495f)
                close()
                moveTo(4.001f, 10.472f)
                lineTo(2.67f, 5.506f)
                curveTo(2.384f, 4.439f, 3.017f, 3.342f, 4.084f, 3.056f)
                lineTo(4.16f, 3.036f)
                curveTo(4.057f, 3.339f, 4.001f, 3.664f, 4.001f, 4.002f)
                verticalLineTo(4.189f)
                curveTo(3.685f, 4.427f, 3.527f, 4.841f, 3.636f, 5.247f)
                lineTo(4.001f, 6.608f)
                verticalLineTo(10.472f)
                close()
                moveTo(5.0f, 9.384f)
                verticalLineTo(4.002f)
                curveTo(5.0f, 2.897f, 5.895f, 2.002f, 7.0f, 2.002f)
                horizontalLineTo(7.106f)
                curveTo(6.958f, 2.223f, 6.844f, 2.472f, 6.772f, 2.743f)
                lineTo(6.69f, 3.051f)
                curveTo(6.289f, 3.181f, 6.0f, 3.558f, 6.0f, 4.002f)
                verticalLineTo(5.636f)
                lineTo(5.0f, 9.384f)
                close()
                moveTo(13.0f, 6.0f)
                curveTo(13.0f, 6.552f, 12.552f, 7.0f, 12.0f, 7.0f)
                curveTo(11.448f, 7.0f, 11.0f, 6.552f, 11.0f, 6.0f)
                curveTo(11.0f, 5.448f, 11.448f, 5.0f, 12.0f, 5.0f)
                curveTo(12.552f, 5.0f, 13.0f, 5.448f, 13.0f, 6.0f)
                close()
                moveTo(10.0f, 14.0f)
                curveTo(10.552f, 14.0f, 11.0f, 13.552f, 11.0f, 13.0f)
                curveTo(11.0f, 12.448f, 10.552f, 12.0f, 10.0f, 12.0f)
                curveTo(9.448f, 12.0f, 9.0f, 12.448f, 9.0f, 13.0f)
                curveTo(9.0f, 13.552f, 9.448f, 14.0f, 10.0f, 14.0f)
                close()
            }
        }
        .build()
        return _playingCards!!
    }

@Suppress("ObjectPropertyName")
private var _playingCards: ImageVector? = null

@Preview
@Composable
private fun PlayingCardsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PlayingCards, contentDescription = "PlayingCards Icon")
    }
}

