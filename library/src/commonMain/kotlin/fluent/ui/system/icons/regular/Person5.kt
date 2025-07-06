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
 * Person5 Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in a very specific moment to share amount of access keys for software.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_person_5_20_regular.svg)
 * 
 * @return The [ImageVector] for the Person5 icon.
 */
public val FluentIcons.Regular.Person5: ImageVector
    get() {
        if (_person5 != null) {
            return _person5!!
        }
        _person5 = Builder(name = "Person5", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 6.0f)
                curveTo(6.0f, 3.791f, 7.791f, 2.0f, 10.0f, 2.0f)
                curveTo(12.209f, 2.0f, 14.0f, 3.791f, 14.0f, 6.0f)
                curveTo(14.0f, 8.209f, 12.209f, 10.0f, 10.0f, 10.0f)
                curveTo(7.791f, 10.0f, 6.0f, 8.209f, 6.0f, 6.0f)
                close()
                moveTo(10.0f, 3.0f)
                curveTo(8.343f, 3.0f, 7.0f, 4.343f, 7.0f, 6.0f)
                curveTo(7.0f, 7.657f, 8.343f, 9.0f, 10.0f, 9.0f)
                curveTo(11.657f, 9.0f, 13.0f, 7.657f, 13.0f, 6.0f)
                curveTo(13.0f, 4.343f, 11.657f, 3.0f, 10.0f, 3.0f)
                close()
                moveTo(3.0f, 13.0f)
                curveTo(3.0f, 11.887f, 3.903f, 11.0f, 5.009f, 11.0f)
                lineTo(12.586f, 11.0f)
                curveTo(12.557f, 11.081f, 12.535f, 11.166f, 12.52f, 11.253f)
                lineTo(12.396f, 12.0f)
                horizontalLineTo(5.009f)
                curveTo(4.448f, 12.0f, 4.0f, 12.447f, 4.0f, 13.0f)
                curveTo(4.0f, 14.309f, 4.622f, 15.284f, 5.673f, 15.953f)
                curveTo(6.743f, 16.636f, 8.265f, 17.0f, 10.0f, 17.0f)
                curveTo(10.777f, 17.0f, 11.511f, 16.927f, 12.181f, 16.785f)
                curveTo(12.01f, 17.102f, 11.956f, 17.475f, 12.037f, 17.831f)
                curveTo(11.387f, 17.945f, 10.703f, 18.0f, 10.0f, 18.0f)
                curveTo(8.145f, 18.0f, 6.417f, 17.614f, 5.135f, 16.797f)
                curveTo(3.833f, 15.966f, 3.0f, 14.691f, 3.0f, 13.0f)
                close()
                moveTo(14.0f, 11.0f)
                curveTo(13.756f, 11.0f, 13.547f, 11.177f, 13.507f, 11.418f)
                lineTo(13.007f, 14.418f)
                curveTo(12.981f, 14.574f, 13.03f, 14.734f, 13.141f, 14.848f)
                curveTo(13.251f, 14.962f, 13.409f, 15.017f, 13.566f, 14.996f)
                lineTo(13.647f, 14.985f)
                lineTo(13.863f, 14.957f)
                curveTo(14.043f, 14.933f, 14.285f, 14.902f, 14.534f, 14.871f)
                curveTo(14.784f, 14.84f, 15.04f, 14.809f, 15.247f, 14.786f)
                curveTo(15.351f, 14.774f, 15.441f, 14.765f, 15.51f, 14.759f)
                curveTo(15.545f, 14.755f, 15.574f, 14.753f, 15.595f, 14.752f)
                curveTo(15.613f, 14.75f, 15.622f, 14.75f, 15.625f, 14.75f)
                curveTo(16.522f, 14.75f, 17.25f, 15.477f, 17.25f, 16.375f)
                curveTo(17.25f, 17.272f, 16.522f, 18.0f, 15.625f, 18.0f)
                curveTo(15.324f, 18.0f, 14.956f, 17.919f, 14.623f, 17.769f)
                curveTo(14.284f, 17.617f, 14.04f, 17.42f, 13.924f, 17.235f)
                curveTo(13.778f, 17.001f, 13.469f, 16.93f, 13.235f, 17.076f)
                curveTo(13.001f, 17.222f, 12.93f, 17.531f, 13.076f, 17.765f)
                curveTo(13.336f, 18.18f, 13.774f, 18.484f, 14.213f, 18.681f)
                curveTo(14.659f, 18.882f, 15.166f, 19.0f, 15.625f, 19.0f)
                curveTo(17.075f, 19.0f, 18.25f, 17.825f, 18.25f, 16.375f)
                curveTo(18.25f, 14.925f, 17.075f, 13.75f, 15.625f, 13.75f)
                curveTo(15.53f, 13.75f, 15.333f, 13.77f, 15.136f, 13.792f)
                curveTo(14.923f, 13.816f, 14.662f, 13.847f, 14.411f, 13.879f)
                curveTo(14.306f, 13.892f, 14.202f, 13.905f, 14.104f, 13.917f)
                lineTo(14.424f, 12.0f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 12.0f, 18.0f, 11.776f, 18.0f, 11.5f)
                curveTo(18.0f, 11.224f, 17.776f, 11.0f, 17.5f, 11.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _person5!!
    }

@Suppress("ObjectPropertyName")
private var _person5: ImageVector? = null

@Preview
@Composable
private fun Person5Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Person5, contentDescription = "Person5 Icon")
    }
}

