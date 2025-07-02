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
 * PeopleEye icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: people, eye
 * - Source: ic_fluent_people_eye_20_regular.svg
 * 
 * @return The [ImageVector] for the PeopleEye icon.
 */
public val FluentIcons.Regular.PeopleEye: ImageVector
    get() {
        if (_peopleEye != null) {
            return _peopleEye!!
        }
        _peopleEye = Builder(name = "PeopleEye", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.75f, 3.5f)
                curveTo(5.507f, 3.5f, 4.5f, 4.507f, 4.5f, 5.75f)
                curveTo(4.5f, 6.993f, 5.507f, 8.0f, 6.75f, 8.0f)
                curveTo(7.993f, 8.0f, 9.0f, 6.993f, 9.0f, 5.75f)
                curveTo(9.0f, 4.507f, 7.993f, 3.5f, 6.75f, 3.5f)
                close()
                moveTo(3.5f, 5.75f)
                curveTo(3.5f, 3.955f, 4.955f, 2.5f, 6.75f, 2.5f)
                curveTo(8.545f, 2.5f, 10.0f, 3.955f, 10.0f, 5.75f)
                curveTo(10.0f, 7.545f, 8.545f, 9.0f, 6.75f, 9.0f)
                curveTo(4.955f, 9.0f, 3.5f, 7.545f, 3.5f, 5.75f)
                close()
                moveTo(11.59f, 10.787f)
                curveTo(11.225f, 10.309f, 10.649f, 10.0f, 10.0f, 10.0f)
                horizontalLineTo(3.5f)
                curveTo(2.395f, 10.0f, 1.5f, 10.895f, 1.5f, 12.0f)
                verticalLineTo(12.063f)
                lineTo(1.5f, 12.064f)
                lineTo(1.5f, 12.066f)
                lineTo(1.5f, 12.071f)
                lineTo(1.5f, 12.083f)
                curveTo(1.5f, 12.094f, 1.501f, 12.107f, 1.502f, 12.124f)
                curveTo(1.503f, 12.157f, 1.506f, 12.203f, 1.512f, 12.259f)
                curveTo(1.523f, 12.372f, 1.544f, 12.527f, 1.587f, 12.712f)
                curveTo(1.672f, 13.08f, 1.841f, 13.572f, 2.182f, 14.066f)
                curveTo(2.883f, 15.08f, 4.237f, 16.0f, 6.75f, 16.0f)
                curveTo(7.754f, 16.0f, 8.572f, 15.853f, 9.238f, 15.612f)
                curveTo(9.105f, 15.283f, 9.022f, 14.952f, 9.004f, 14.632f)
                curveTo(8.439f, 14.854f, 7.705f, 15.0f, 6.75f, 15.0f)
                curveTo(4.513f, 15.0f, 3.492f, 14.201f, 3.005f, 13.497f)
                curveTo(2.752f, 13.131f, 2.625f, 12.764f, 2.561f, 12.487f)
                curveTo(2.53f, 12.35f, 2.514f, 12.237f, 2.507f, 12.161f)
                curveTo(2.503f, 12.123f, 2.501f, 12.095f, 2.501f, 12.078f)
                lineTo(2.5f, 12.061f)
                lineTo(2.5f, 12.06f)
                verticalLineTo(12.0f)
                curveTo(2.5f, 11.448f, 2.948f, 11.0f, 3.5f, 11.0f)
                horizontalLineTo(10.0f)
                curveTo(10.311f, 11.0f, 10.588f, 11.142f, 10.771f, 11.363f)
                curveTo(11.019f, 11.156f, 11.293f, 10.961f, 11.59f, 10.787f)
                close()
                moveTo(14.5f, 5.0f)
                curveTo(13.672f, 5.0f, 13.0f, 5.672f, 13.0f, 6.5f)
                curveTo(13.0f, 7.328f, 13.672f, 8.0f, 14.5f, 8.0f)
                curveTo(15.328f, 8.0f, 16.0f, 7.328f, 16.0f, 6.5f)
                curveTo(16.0f, 5.672f, 15.328f, 5.0f, 14.5f, 5.0f)
                close()
                moveTo(12.0f, 6.5f)
                curveTo(12.0f, 5.119f, 13.119f, 4.0f, 14.5f, 4.0f)
                curveTo(15.881f, 4.0f, 17.0f, 5.119f, 17.0f, 6.5f)
                curveTo(17.0f, 7.881f, 15.881f, 9.0f, 14.5f, 9.0f)
                curveTo(13.119f, 9.0f, 12.0f, 7.881f, 12.0f, 6.5f)
                close()
                moveTo(14.5f, 11.0f)
                curveTo(11.736f, 11.0f, 10.0f, 13.318f, 10.0f, 14.5f)
                curveTo(10.0f, 15.7f, 11.739f, 18.0f, 14.5f, 18.0f)
                curveTo(17.261f, 18.0f, 19.0f, 15.682f, 19.0f, 14.5f)
                curveTo(19.0f, 13.3f, 17.261f, 11.0f, 14.5f, 11.0f)
                close()
                moveTo(14.5f, 17.0f)
                curveTo(14.005f, 17.0f, 13.522f, 16.853f, 13.111f, 16.579f)
                curveTo(12.7f, 16.304f, 12.38f, 15.913f, 12.19f, 15.457f)
                curveTo(12.001f, 15.0f, 11.952f, 14.497f, 12.048f, 14.012f)
                curveTo(12.144f, 13.527f, 12.383f, 13.082f, 12.732f, 12.732f)
                curveTo(13.082f, 12.383f, 13.527f, 12.144f, 14.012f, 12.048f)
                curveTo(14.497f, 11.952f, 15.0f, 12.001f, 15.457f, 12.19f)
                curveTo(15.913f, 12.38f, 16.304f, 12.7f, 16.579f, 13.111f)
                curveTo(16.853f, 13.522f, 17.0f, 14.005f, 17.0f, 14.5f)
                curveTo(17.0f, 15.163f, 16.737f, 15.799f, 16.268f, 16.268f)
                curveTo(15.799f, 16.737f, 15.163f, 17.0f, 14.5f, 17.0f)
                close()
                moveTo(16.0f, 14.5f)
                curveTo(16.0f, 14.797f, 15.912f, 15.087f, 15.747f, 15.333f)
                curveTo(15.582f, 15.58f, 15.348f, 15.772f, 15.074f, 15.886f)
                curveTo(14.8f, 15.999f, 14.498f, 16.029f, 14.207f, 15.971f)
                curveTo(13.916f, 15.913f, 13.649f, 15.77f, 13.439f, 15.561f)
                curveTo(13.23f, 15.351f, 13.087f, 15.084f, 13.029f, 14.793f)
                curveTo(12.971f, 14.502f, 13.001f, 14.2f, 13.114f, 13.926f)
                curveTo(13.228f, 13.652f, 13.42f, 13.418f, 13.667f, 13.253f)
                curveTo(13.913f, 13.088f, 14.203f, 13.0f, 14.5f, 13.0f)
                curveTo(14.898f, 13.0f, 15.279f, 13.158f, 15.561f, 13.439f)
                curveTo(15.842f, 13.721f, 16.0f, 14.102f, 16.0f, 14.5f)
                close()
            }
        }
        .build()
        return _peopleEye!!
    }

@Suppress("ObjectPropertyName")
private var _peopleEye: ImageVector? = null

@Preview
@Composable
private fun PeopleEyePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PeopleEye, contentDescription = null)
    }
}

