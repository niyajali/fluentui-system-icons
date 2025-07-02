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
 * TabletSpeaker icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: tablet, speaker
 * - Source: ic_fluent_tablet_speaker_24_regular.svg
 * 
 * @return The [ImageVector] for the TabletSpeaker icon.
 */
public val FluentIcons.Regular.TabletSpeaker: ImageVector
    get() {
        if (_tabletSpeaker != null) {
            return _tabletSpeaker!!
        }
        _tabletSpeaker = Builder(name = "TabletSpeaker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.143f, 3.302f)
                curveTo(21.815f, 2.755f, 21.478f, 2.381f, 21.23f, 2.174f)
                curveTo(20.912f, 1.909f, 20.439f, 1.952f, 20.174f, 2.27f)
                curveTo(19.909f, 2.588f, 19.952f, 3.061f, 20.27f, 3.326f)
                curveTo(20.397f, 3.432f, 20.623f, 3.683f, 20.857f, 4.073f)
                curveTo(21.258f, 4.742f, 21.5f, 5.548f, 21.5f, 6.5f)
                curveTo(21.5f, 7.452f, 21.258f, 8.258f, 20.857f, 8.927f)
                curveTo(20.623f, 9.317f, 20.397f, 9.568f, 20.27f, 9.674f)
                curveTo(19.952f, 9.939f, 19.909f, 10.412f, 20.174f, 10.73f)
                curveTo(20.439f, 11.048f, 20.912f, 11.091f, 21.23f, 10.826f)
                curveTo(21.478f, 10.619f, 21.815f, 10.245f, 22.143f, 9.698f)
                curveTo(22.679f, 8.805f, 23.0f, 7.736f, 23.0f, 6.5f)
                curveTo(23.0f, 5.264f, 22.679f, 4.195f, 22.143f, 3.302f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.874f, 4.396f)
                curveTo(19.635f, 4.038f, 19.389f, 3.791f, 19.2f, 3.65f)
                curveTo(18.869f, 3.401f, 18.399f, 3.469f, 18.15f, 3.8f)
                curveTo(17.902f, 4.131f, 17.969f, 4.601f, 18.3f, 4.85f)
                curveTo(18.362f, 4.896f, 18.49f, 5.025f, 18.626f, 5.229f)
                curveTo(18.86f, 5.58f, 19.0f, 6.0f, 19.0f, 6.5f)
                curveTo(19.0f, 7.0f, 18.86f, 7.421f, 18.626f, 7.771f)
                curveTo(18.49f, 7.975f, 18.362f, 8.104f, 18.3f, 8.15f)
                lineTo(18.216f, 8.223f)
                curveTo(17.959f, 8.483f, 17.924f, 8.899f, 18.15f, 9.2f)
                curveTo(18.399f, 9.531f, 18.869f, 9.599f, 19.2f, 9.35f)
                curveTo(19.389f, 9.209f, 19.635f, 8.962f, 19.874f, 8.604f)
                curveTo(20.265f, 8.017f, 20.5f, 7.312f, 20.5f, 6.5f)
                curveTo(20.5f, 5.688f, 20.265f, 4.983f, 19.874f, 4.396f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 3.75f)
                curveTo(17.0f, 3.438f, 16.806f, 3.158f, 16.514f, 3.048f)
                curveTo(16.221f, 2.938f, 15.891f, 3.021f, 15.686f, 3.256f)
                lineTo(14.16f, 5.0f)
                horizontalLineTo(12.75f)
                curveTo(12.336f, 5.0f, 12.0f, 5.336f, 12.0f, 5.75f)
                verticalLineTo(7.25f)
                curveTo(12.0f, 7.664f, 12.336f, 8.0f, 12.75f, 8.0f)
                horizontalLineTo(14.16f)
                lineTo(15.686f, 9.744f)
                curveTo(15.891f, 9.979f, 16.221f, 10.062f, 16.514f, 9.952f)
                curveTo(16.806f, 9.842f, 17.0f, 9.562f, 17.0f, 9.25f)
                verticalLineTo(3.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.25f, 4.0f)
                lineTo(12.0f, 4.0f)
                curveTo(11.448f, 4.0f, 11.0f, 4.448f, 11.0f, 5.0f)
                verticalLineTo(5.5f)
                horizontalLineTo(4.25f)
                curveTo(3.836f, 5.5f, 3.5f, 5.835f, 3.5f, 6.25f)
                verticalLineTo(17.752f)
                curveTo(3.5f, 18.166f, 3.836f, 18.502f, 4.25f, 18.502f)
                horizontalLineTo(19.749f)
                curveTo(20.163f, 18.502f, 20.499f, 18.166f, 20.499f, 17.752f)
                verticalLineTo(11.982f)
                curveTo(20.973f, 12.051f, 21.473f, 11.925f, 21.87f, 11.594f)
                curveTo(21.912f, 11.559f, 21.955f, 11.522f, 21.999f, 11.482f)
                verticalLineTo(17.752f)
                curveTo(21.999f, 18.994f, 20.992f, 20.002f, 19.749f, 20.002f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 20.002f, 2.0f, 18.994f, 2.0f, 17.752f)
                verticalLineTo(6.25f)
                curveTo(2.0f, 5.007f, 3.007f, 4.0f, 4.25f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.75f, 15.5f)
                curveTo(14.164f, 15.5f, 14.5f, 15.836f, 14.5f, 16.25f)
                curveTo(14.5f, 16.63f, 14.218f, 16.943f, 13.852f, 16.993f)
                lineTo(13.75f, 17.0f)
                horizontalLineTo(10.25f)
                curveTo(9.836f, 17.0f, 9.5f, 16.664f, 9.5f, 16.25f)
                curveTo(9.5f, 15.87f, 9.782f, 15.557f, 10.148f, 15.507f)
                lineTo(10.25f, 15.5f)
                horizontalLineTo(13.75f)
                close()
            }
        }
        .build()
        return _tabletSpeaker!!
    }

@Suppress("ObjectPropertyName")
private var _tabletSpeaker: ImageVector? = null

@Preview
@Composable
private fun TabletSpeakerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TabletSpeaker, contentDescription = null)
    }
}

