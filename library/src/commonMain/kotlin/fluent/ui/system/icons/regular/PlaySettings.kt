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
 * PlaySettings icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: play, settings
 * - Source: ic_fluent_play_settings_20_regular.svg
 * 
 * @return The [ImageVector] for the PlaySettings icon.
 */
public val FluentIcons.Regular.PlaySettings: ImageVector
    get() {
        if (_playSettings != null) {
            return _playSettings!!
        }
        _playSettings = Builder(name = "PlaySettings", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.22f, 8.687f)
                curveTo(18.255f, 9.257f, 18.255f, 10.743f, 17.22f, 11.313f)
                lineTo(11.991f, 14.189f)
                curveTo(11.971f, 13.828f, 11.916f, 13.477f, 11.829f, 13.137f)
                lineTo(16.737f, 10.438f)
                curveTo(17.083f, 10.248f, 17.083f, 9.752f, 16.737f, 9.562f)
                lineTo(6.741f, 4.063f)
                curveTo(6.407f, 3.88f, 5.999f, 4.121f, 5.999f, 4.501f)
                lineTo(5.999f, 9.022f)
                curveTo(5.656f, 9.053f, 5.322f, 9.116f, 4.999f, 9.207f)
                verticalLineTo(4.501f)
                curveTo(4.999f, 3.361f, 6.223f, 2.638f, 7.223f, 3.188f)
                lineTo(17.22f, 8.687f)
                close()
                moveTo(4.065f, 11.442f)
                curveTo(4.368f, 12.523f, 3.722f, 13.642f, 2.634f, 13.92f)
                lineTo(2.173f, 14.038f)
                curveTo(2.158f, 14.19f, 2.15f, 14.344f, 2.15f, 14.5f)
                curveTo(2.15f, 14.688f, 2.161f, 14.873f, 2.183f, 15.054f)
                lineTo(2.533f, 15.137f)
                curveTo(3.652f, 15.401f, 4.318f, 16.554f, 3.989f, 17.656f)
                lineTo(3.862f, 18.079f)
                curveTo(4.12f, 18.282f, 4.399f, 18.456f, 4.697f, 18.596f)
                lineTo(5.022f, 18.252f)
                curveTo(5.812f, 17.416f, 7.143f, 17.417f, 7.932f, 18.254f)
                lineTo(8.269f, 18.612f)
                curveTo(8.561f, 18.477f, 8.837f, 18.309f, 9.091f, 18.114f)
                lineTo(8.935f, 17.558f)
                curveTo(8.631f, 16.476f, 9.277f, 15.358f, 10.365f, 15.08f)
                lineTo(10.826f, 14.962f)
                curveTo(10.841f, 14.81f, 10.848f, 14.656f, 10.848f, 14.5f)
                curveTo(10.848f, 14.312f, 10.837f, 14.127f, 10.816f, 13.945f)
                lineTo(10.467f, 13.863f)
                curveTo(9.347f, 13.598f, 8.681f, 12.446f, 9.011f, 11.344f)
                lineTo(9.137f, 10.922f)
                curveTo(8.88f, 10.718f, 8.6f, 10.544f, 8.302f, 10.403f)
                lineTo(7.977f, 10.747f)
                curveTo(7.188f, 11.583f, 5.857f, 11.583f, 5.068f, 10.746f)
                lineTo(4.73f, 10.388f)
                curveTo(4.438f, 10.523f, 4.163f, 10.69f, 3.909f, 10.885f)
                lineTo(4.065f, 11.442f)
                close()
                moveTo(6.499f, 15.5f)
                curveTo(5.947f, 15.5f, 5.499f, 15.052f, 5.499f, 14.5f)
                curveTo(5.499f, 13.948f, 5.947f, 13.5f, 6.499f, 13.5f)
                curveTo(7.052f, 13.5f, 7.499f, 13.948f, 7.499f, 14.5f)
                curveTo(7.499f, 15.052f, 7.052f, 15.5f, 6.499f, 15.5f)
                close()
            }
        }
        .build()
        return _playSettings!!
    }

@Suppress("ObjectPropertyName")
private var _playSettings: ImageVector? = null

@Preview
@Composable
private fun PlaySettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PlaySettings, contentDescription = null)
    }
}

