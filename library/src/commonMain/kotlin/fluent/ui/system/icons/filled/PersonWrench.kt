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
 * PersonWrench icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: person, wrench
 * - Source: ic_fluent_person_wrench_20_filled.svg
 * 
 * @return The [ImageVector] for the PersonWrench icon.
 */
public val FluentIcons.Filled.PersonWrench: ImageVector
    get() {
        if (_personWrench != null) {
            return _personWrench!!
        }
        _personWrench = Builder(name = "PersonWrench", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 6.0f)
                curveTo(6.0f, 3.791f, 7.791f, 2.0f, 10.0f, 2.0f)
                curveTo(12.209f, 2.0f, 14.0f, 3.791f, 14.0f, 6.0f)
                curveTo(14.0f, 7.202f, 13.47f, 8.28f, 12.631f, 9.013f)
                curveTo(12.593f, 9.044f, 12.556f, 9.075f, 12.52f, 9.107f)
                curveTo(11.832f, 9.665f, 10.955f, 10.0f, 10.0f, 10.0f)
                curveTo(7.791f, 10.0f, 6.0f, 8.209f, 6.0f, 6.0f)
                close()
                moveTo(11.226f, 11.0f)
                lineTo(5.009f, 11.0f)
                curveTo(3.903f, 11.0f, 3.0f, 11.887f, 3.0f, 13.0f)
                curveTo(3.0f, 14.691f, 3.833f, 15.966f, 5.135f, 16.797f)
                curveTo(5.946f, 17.314f, 6.936f, 17.659f, 8.024f, 17.842f)
                curveTo(7.919f, 17.089f, 8.156f, 16.298f, 8.734f, 15.719f)
                lineTo(11.052f, 13.402f)
                curveTo(10.893f, 12.605f, 10.951f, 11.773f, 11.226f, 11.0f)
                close()
                moveTo(15.892f, 9.024f)
                curveTo(16.258f, 9.066f, 16.363f, 9.505f, 16.102f, 9.766f)
                lineTo(15.127f, 10.741f)
                curveTo(14.538f, 11.33f, 14.538f, 12.284f, 15.127f, 12.873f)
                curveTo(15.716f, 13.462f, 16.67f, 13.462f, 17.259f, 12.873f)
                lineTo(18.234f, 11.898f)
                curveTo(18.495f, 11.637f, 18.934f, 11.742f, 18.976f, 12.108f)
                curveTo(19.096f, 13.14f, 18.761f, 14.214f, 17.97f, 15.005f)
                curveTo(16.978f, 15.997f, 15.54f, 16.273f, 14.3f, 15.832f)
                lineTo(11.574f, 18.558f)
                curveTo(10.985f, 19.147f, 10.03f, 19.147f, 9.442f, 18.558f)
                curveTo(8.853f, 17.97f, 8.853f, 17.015f, 9.442f, 16.426f)
                lineTo(12.168f, 13.7f)
                curveTo(11.727f, 12.46f, 12.003f, 11.023f, 12.995f, 10.03f)
                curveTo(13.786f, 9.239f, 14.86f, 8.904f, 15.892f, 9.024f)
                close()
            }
        }
        .build()
        return _personWrench!!
    }

@Suppress("ObjectPropertyName")
private var _personWrench: ImageVector? = null

@Preview
@Composable
private fun PersonWrenchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PersonWrench, contentDescription = null)
    }
}

