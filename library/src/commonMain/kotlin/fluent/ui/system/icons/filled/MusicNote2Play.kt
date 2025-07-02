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
 * MusicNote2Play icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: music, note2play
 * - Source: ic_fluent_music_note_2_play_20_filled.svg
 * 
 * @return The [ImageVector] for the MusicNote2Play icon.
 */
public val FluentIcons.Filled.MusicNote2Play: ImageVector
    get() {
        if (_musicNote2Play != null) {
            return _musicNote2Play!!
        }
        _musicNote2Play = Builder(name = "MusicNote2Play", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.987f, 3.016f)
                curveTo(15.891f, 2.43f, 15.292f, 2.041f, 14.702f, 2.226f)
                lineTo(7.702f, 4.413f)
                curveTo(7.284f, 4.544f, 7.0f, 4.931f, 7.0f, 5.368f)
                verticalLineTo(13.5f)
                curveTo(6.582f, 13.186f, 6.063f, 13.0f, 5.5f, 13.0f)
                curveTo(4.119f, 13.0f, 3.0f, 14.12f, 3.0f, 15.5f)
                curveTo(3.0f, 16.881f, 4.119f, 18.0f, 5.5f, 18.0f)
                curveTo(6.881f, 18.0f, 8.0f, 16.881f, 8.0f, 15.5f)
                verticalLineTo(8.368f)
                lineTo(15.0f, 6.18f)
                verticalLineTo(9.023f)
                curveTo(15.343f, 9.054f, 15.678f, 9.116f, 16.0f, 9.207f)
                verticalLineTo(3.18f)
                curveTo(16.0f, 3.124f, 15.995f, 3.069f, 15.987f, 3.016f)
                close()
                moveTo(19.0f, 14.5f)
                curveTo(19.0f, 16.986f, 16.985f, 19.0f, 14.5f, 19.0f)
                curveTo(12.015f, 19.0f, 10.0f, 16.986f, 10.0f, 14.5f)
                curveTo(10.0f, 12.015f, 12.015f, 10.0f, 14.5f, 10.0f)
                curveTo(16.985f, 10.0f, 19.0f, 12.015f, 19.0f, 14.5f)
                close()
                moveTo(16.737f, 14.064f)
                lineTo(13.743f, 12.414f)
                curveTo(13.409f, 12.231f, 13.001f, 12.472f, 13.001f, 12.852f)
                lineTo(13.001f, 16.152f)
                curveTo(13.001f, 16.533f, 13.409f, 16.774f, 13.743f, 16.59f)
                lineTo(16.737f, 14.94f)
                curveTo(17.081f, 14.75f, 17.082f, 14.255f, 16.737f, 14.064f)
                close()
            }
        }
        .build()
        return _musicNote2Play!!
    }

@Suppress("ObjectPropertyName")
private var _musicNote2Play: ImageVector? = null

@Preview
@Composable
private fun MusicNote2PlayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MusicNote2Play, contentDescription = null)
    }
}

