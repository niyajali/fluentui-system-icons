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
 * SportCricketBall Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 24dp
 * - Keywords: sport, cricket, ball
 * - Description: No description provided.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_sport_cricket_ball_24_filled.svg)
 * 
 * @return The [ImageVector] for the SportCricketBall icon.
 */
public val FluentIcons.Filled.SportCricketBall: ImageVector
    get() {
        if (_sportCricketBall != null) {
            return _sportCricketBall!!
        }
        _sportCricketBall = Builder(name = "SportCricketBall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(13.718f, 2.0f, 15.335f, 2.433f, 16.747f, 3.196f)
                curveTo(16.596f, 3.333f, 16.5f, 3.53f, 16.5f, 3.75f)
                verticalLineTo(5.25f)
                curveTo(16.5f, 5.664f, 16.836f, 6.0f, 17.25f, 6.0f)
                curveTo(17.664f, 6.0f, 18.0f, 5.664f, 18.0f, 5.25f)
                verticalLineTo(3.999f)
                curveTo(20.429f, 5.823f, 22.0f, 8.728f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(5.25f, 15.0f)
                curveTo(4.836f, 15.0f, 4.5f, 15.336f, 4.5f, 15.75f)
                verticalLineTo(17.25f)
                curveTo(4.5f, 17.664f, 4.836f, 18.0f, 5.25f, 18.0f)
                curveTo(5.664f, 18.0f, 6.0f, 17.664f, 6.0f, 17.25f)
                verticalLineTo(15.75f)
                curveTo(6.0f, 15.336f, 5.664f, 15.0f, 5.25f, 15.0f)
                close()
                moveTo(8.25f, 16.5f)
                curveTo(7.836f, 16.5f, 7.5f, 16.836f, 7.5f, 17.25f)
                curveTo(7.5f, 17.664f, 7.836f, 18.0f, 8.25f, 18.0f)
                horizontalLineTo(9.75f)
                curveTo(10.164f, 18.0f, 10.5f, 17.664f, 10.5f, 17.25f)
                curveTo(10.5f, 16.836f, 10.164f, 16.5f, 9.75f, 16.5f)
                horizontalLineTo(8.25f)
                close()
                moveTo(8.25f, 12.0f)
                curveTo(7.836f, 12.0f, 7.5f, 12.336f, 7.5f, 12.75f)
                verticalLineTo(14.25f)
                curveTo(7.5f, 14.664f, 7.836f, 15.0f, 8.25f, 15.0f)
                curveTo(8.664f, 15.0f, 9.0f, 14.664f, 9.0f, 14.25f)
                verticalLineTo(12.75f)
                curveTo(9.0f, 12.336f, 8.664f, 12.0f, 8.25f, 12.0f)
                close()
                moveTo(11.25f, 13.5f)
                curveTo(10.836f, 13.5f, 10.5f, 13.836f, 10.5f, 14.25f)
                curveTo(10.5f, 14.664f, 10.836f, 15.0f, 11.25f, 15.0f)
                horizontalLineTo(12.75f)
                curveTo(13.164f, 15.0f, 13.5f, 14.664f, 13.5f, 14.25f)
                curveTo(13.5f, 13.836f, 13.164f, 13.5f, 12.75f, 13.5f)
                horizontalLineTo(11.25f)
                close()
                moveTo(11.25f, 9.0f)
                curveTo(10.836f, 9.0f, 10.5f, 9.336f, 10.5f, 9.75f)
                verticalLineTo(11.25f)
                curveTo(10.5f, 11.664f, 10.836f, 12.0f, 11.25f, 12.0f)
                curveTo(11.664f, 12.0f, 12.0f, 11.664f, 12.0f, 11.25f)
                verticalLineTo(9.75f)
                curveTo(12.0f, 9.336f, 11.664f, 9.0f, 11.25f, 9.0f)
                close()
                moveTo(14.25f, 10.5f)
                curveTo(13.836f, 10.5f, 13.5f, 10.836f, 13.5f, 11.25f)
                curveTo(13.5f, 11.664f, 13.836f, 12.0f, 14.25f, 12.0f)
                horizontalLineTo(15.75f)
                curveTo(16.164f, 12.0f, 16.5f, 11.664f, 16.5f, 11.25f)
                curveTo(16.5f, 10.836f, 16.164f, 10.5f, 15.75f, 10.5f)
                horizontalLineTo(14.25f)
                close()
                moveTo(14.25f, 6.0f)
                curveTo(13.836f, 6.0f, 13.5f, 6.336f, 13.5f, 6.75f)
                verticalLineTo(8.25f)
                curveTo(13.5f, 8.664f, 13.836f, 9.0f, 14.25f, 9.0f)
                curveTo(14.664f, 9.0f, 15.0f, 8.664f, 15.0f, 8.25f)
                verticalLineTo(6.75f)
                curveTo(15.0f, 6.336f, 14.664f, 6.0f, 14.25f, 6.0f)
                close()
                moveTo(17.25f, 7.5f)
                curveTo(16.836f, 7.5f, 16.5f, 7.836f, 16.5f, 8.25f)
                curveTo(16.5f, 8.664f, 16.836f, 9.0f, 17.25f, 9.0f)
                horizontalLineTo(18.75f)
                curveTo(19.164f, 9.0f, 19.5f, 8.664f, 19.5f, 8.25f)
                curveTo(19.5f, 7.836f, 19.164f, 7.5f, 18.75f, 7.5f)
                horizontalLineTo(17.25f)
                close()
            }
        }
        .build()
        return _sportCricketBall!!
    }

@Suppress("ObjectPropertyName")
private var _sportCricketBall: ImageVector? = null

@Preview
@Composable
private fun SportCricketBallPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SportCricketBall, contentDescription = "SportCricketBall Icon")
    }
}

