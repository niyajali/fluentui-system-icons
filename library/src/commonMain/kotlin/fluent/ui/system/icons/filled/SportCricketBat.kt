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
 * SportCricketBat Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 24dp
 * - Keywords: sport, cricket, bat
 * - Description: No description provided.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_sport_cricket_bat_24_filled.svg)
 * 
 * @return The [ImageVector] for the SportCricketBat icon.
 */
public val FluentIcons.Filled.SportCricketBat: ImageVector
    get() {
        if (_sportCricketBat != null) {
            return _sportCricketBat!!
        }
        _sportCricketBat = Builder(name = "SportCricketBat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.027f, 10.086f)
                curveTo(17.012f, 10.189f, 17.003f, 10.295f, 17.003f, 10.4f)
                verticalLineTo(11.723f)
                curveTo(17.003f, 12.319f, 16.766f, 12.893f, 16.344f, 13.315f)
                lineTo(8.32f, 21.338f)
                curveTo(7.441f, 22.216f, 6.017f, 22.217f, 5.138f, 21.338f)
                lineTo(2.663f, 18.864f)
                curveTo(1.785f, 17.985f, 1.785f, 16.56f, 2.663f, 15.681f)
                lineTo(10.686f, 7.66f)
                curveTo(11.108f, 7.238f, 11.68f, 7.0f, 12.277f, 7.0f)
                horizontalLineTo(13.59f)
                curveTo(13.699f, 7.0f, 13.807f, 6.989f, 13.913f, 6.973f)
                lineTo(17.027f, 10.086f)
                close()
                moveTo(19.143f, 2.392f)
                curveTo(19.83f, 1.832f, 20.844f, 1.872f, 21.485f, 2.512f)
                lineTo(21.605f, 2.645f)
                curveTo(22.128f, 3.286f, 22.128f, 4.213f, 21.605f, 4.854f)
                lineTo(21.485f, 4.987f)
                lineTo(17.766f, 8.704f)
                lineTo(15.291f, 6.23f)
                lineTo(19.01f, 2.512f)
                lineTo(19.143f, 2.392f)
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
        Image(imageVector = FluentIcons.Filled.SportCricketBat, contentDescription = "SportCricketBat Icon")
    }
}

