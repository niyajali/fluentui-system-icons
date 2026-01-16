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
 * SportCricketBat Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: sport, cricket, bat
 * - Description: No description provided.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_sport_cricket_bat_24_regular.svg)
 * 
 * @return The [ImageVector] for the SportCricketBat icon.
 */
public val FluentIcons.Regular.SportCricketBat: ImageVector
    get() {
        if (_sportCricketBat != null) {
            return _sportCricketBat!!
        }
        _sportCricketBat = Builder(name = "SportCricketBat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.731f, 2.732f)
                curveTo(18.707f, 1.756f, 20.29f, 1.757f, 21.266f, 2.732f)
                curveTo(22.243f, 3.708f, 22.242f, 5.291f, 21.266f, 6.267f)
                lineTo(17.661f, 9.873f)
                curveTo(17.239f, 10.295f, 17.002f, 10.867f, 17.001f, 11.464f)
                verticalLineTo(11.723f)
                lineTo(16.991f, 11.946f)
                curveTo(16.94f, 12.461f, 16.711f, 12.945f, 16.342f, 13.314f)
                lineTo(8.319f, 21.338f)
                curveTo(7.44f, 22.216f, 6.015f, 22.216f, 5.136f, 21.338f)
                lineTo(2.662f, 18.863f)
                curveTo(1.784f, 17.984f, 1.784f, 16.56f, 2.662f, 15.681f)
                lineTo(10.684f, 7.659f)
                curveTo(11.106f, 7.237f, 11.678f, 7.0f, 12.275f, 7.0f)
                horizontalLineTo(12.532f)
                curveTo(13.128f, 7.0f, 13.701f, 6.762f, 14.123f, 6.341f)
                lineTo(17.731f, 2.732f)
                close()
                moveTo(14.095f, 8.157f)
                curveTo(13.609f, 8.38f, 13.077f, 8.5f, 12.532f, 8.5f)
                horizontalLineTo(12.275f)
                curveTo(12.077f, 8.5f, 11.885f, 8.579f, 11.745f, 8.719f)
                lineTo(3.722f, 16.742f)
                curveTo(3.43f, 17.035f, 3.43f, 17.51f, 3.722f, 17.802f)
                lineTo(6.197f, 20.277f)
                curveTo(6.49f, 20.57f, 6.965f, 20.57f, 7.258f, 20.277f)
                lineTo(15.282f, 12.254f)
                curveTo(15.387f, 12.148f, 15.458f, 12.014f, 15.487f, 11.87f)
                lineTo(15.502f, 11.723f)
                verticalLineTo(11.464f)
                curveTo(15.502f, 10.92f, 15.62f, 10.389f, 15.842f, 9.904f)
                lineTo(14.095f, 8.157f)
                close()
                moveTo(20.206f, 3.793f)
                curveTo(19.815f, 3.403f, 19.182f, 3.402f, 18.792f, 3.793f)
                lineTo(15.322f, 7.262f)
                lineTo(16.736f, 8.676f)
                lineTo(20.206f, 5.207f)
                curveTo(20.596f, 4.816f, 20.596f, 4.183f, 20.206f, 3.793f)
                close()
            }
        }
        .build()
        return _sportCricketBat!!
    }

@Suppress("ObjectPropertyName")
private var _sportCricketBat: ImageVector? = null

@Preview
@Composable
private fun SportCricketBatPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SportCricketBat, contentDescription = "SportCricketBat Icon")
    }
}

