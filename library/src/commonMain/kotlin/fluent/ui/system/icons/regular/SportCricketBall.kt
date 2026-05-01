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
 * SportCricketBall Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: sport, cricket, ball
 * - Description: No description provided.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_sport_cricket_ball_24_regular.svg)
 * 
 * @return The [ImageVector] for the SportCricketBall icon.
 */
public val FluentIcons.Regular.SportCricketBall: ImageVector
    get() {
        if (_sportCricketBall != null) {
            return _sportCricketBall!!
        }
        _sportCricketBall = Builder(name = "SportCricketBall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(9.679f, 22.0f, 7.545f, 21.207f, 5.848f, 19.881f)
                curveTo(5.802f, 19.851f, 5.758f, 19.819f, 5.72f, 19.78f)
                curveTo(3.452f, 17.947f, 2.0f, 15.144f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 3.5f)
                curveTo(7.306f, 3.5f, 3.5f, 7.306f, 3.5f, 12.0f)
                curveTo(3.5f, 14.608f, 4.676f, 16.941f, 6.525f, 18.5f)
                horizontalLineTo(7.75f)
                curveTo(8.164f, 18.5f, 8.5f, 18.836f, 8.5f, 19.25f)
                curveTo(8.5f, 19.412f, 8.447f, 19.56f, 8.36f, 19.683f)
                curveTo(9.464f, 20.206f, 10.698f, 20.5f, 12.0f, 20.5f)
                curveTo(16.694f, 20.5f, 20.5f, 16.694f, 20.5f, 12.0f)
                curveTo(20.5f, 10.554f, 20.137f, 9.192f, 19.5f, 8.0f)
                horizontalLineTo(18.25f)
                curveTo(17.836f, 8.0f, 17.5f, 7.664f, 17.5f, 7.25f)
                curveTo(17.5f, 6.836f, 17.836f, 6.5f, 18.25f, 6.5f)
                horizontalLineTo(18.479f)
                curveTo(16.919f, 4.665f, 14.596f, 3.5f, 12.0f, 3.5f)
                close()
                moveTo(6.25f, 14.0f)
                curveTo(6.664f, 14.0f, 7.0f, 14.336f, 7.0f, 14.75f)
                verticalLineTo(16.25f)
                curveTo(7.0f, 16.664f, 6.664f, 17.0f, 6.25f, 17.0f)
                curveTo(5.836f, 17.0f, 5.5f, 16.664f, 5.5f, 16.25f)
                verticalLineTo(14.75f)
                curveTo(5.5f, 14.336f, 5.836f, 14.0f, 6.25f, 14.0f)
                close()
                moveTo(10.75f, 15.5f)
                curveTo(11.164f, 15.5f, 11.5f, 15.836f, 11.5f, 16.25f)
                curveTo(11.5f, 16.664f, 11.164f, 17.0f, 10.75f, 17.0f)
                horizontalLineTo(9.25f)
                curveTo(8.836f, 17.0f, 8.5f, 16.664f, 8.5f, 16.25f)
                curveTo(8.5f, 15.836f, 8.836f, 15.5f, 9.25f, 15.5f)
                horizontalLineTo(10.75f)
                close()
                moveTo(9.25f, 11.0f)
                curveTo(9.664f, 11.0f, 10.0f, 11.336f, 10.0f, 11.75f)
                verticalLineTo(13.25f)
                curveTo(10.0f, 13.664f, 9.664f, 14.0f, 9.25f, 14.0f)
                curveTo(8.836f, 14.0f, 8.5f, 13.664f, 8.5f, 13.25f)
                verticalLineTo(11.75f)
                curveTo(8.5f, 11.336f, 8.836f, 11.0f, 9.25f, 11.0f)
                close()
                moveTo(13.75f, 12.5f)
                curveTo(14.164f, 12.5f, 14.5f, 12.836f, 14.5f, 13.25f)
                curveTo(14.5f, 13.664f, 14.164f, 14.0f, 13.75f, 14.0f)
                horizontalLineTo(12.25f)
                curveTo(11.836f, 14.0f, 11.5f, 13.664f, 11.5f, 13.25f)
                curveTo(11.5f, 12.836f, 11.836f, 12.5f, 12.25f, 12.5f)
                horizontalLineTo(13.75f)
                close()
                moveTo(12.25f, 8.0f)
                curveTo(12.664f, 8.0f, 13.0f, 8.336f, 13.0f, 8.75f)
                verticalLineTo(10.25f)
                curveTo(13.0f, 10.664f, 12.664f, 11.0f, 12.25f, 11.0f)
                curveTo(11.836f, 11.0f, 11.5f, 10.664f, 11.5f, 10.25f)
                verticalLineTo(8.75f)
                curveTo(11.5f, 8.336f, 11.836f, 8.0f, 12.25f, 8.0f)
                close()
                moveTo(16.75f, 9.5f)
                curveTo(17.164f, 9.5f, 17.5f, 9.836f, 17.5f, 10.25f)
                curveTo(17.5f, 10.664f, 17.164f, 11.0f, 16.75f, 11.0f)
                horizontalLineTo(15.25f)
                curveTo(14.836f, 11.0f, 14.5f, 10.664f, 14.5f, 10.25f)
                curveTo(14.5f, 9.836f, 14.836f, 9.5f, 15.25f, 9.5f)
                horizontalLineTo(16.75f)
                close()
                moveTo(15.25f, 5.0f)
                curveTo(15.664f, 5.0f, 16.0f, 5.336f, 16.0f, 5.75f)
                verticalLineTo(7.25f)
                curveTo(16.0f, 7.664f, 15.664f, 8.0f, 15.25f, 8.0f)
                curveTo(14.836f, 8.0f, 14.5f, 7.664f, 14.5f, 7.25f)
                verticalLineTo(5.75f)
                curveTo(14.5f, 5.336f, 14.836f, 5.0f, 15.25f, 5.0f)
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
        Image(imageVector = FluentIcons.Regular.SportCricketBall, contentDescription = "SportCricketBall Icon")
    }
}

