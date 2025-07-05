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
 * PersonLightning Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in a wide range of scenarios - representing a general person, a contact, contact lists, sharing, and managing access.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_person_lightning_20_regular.svg)
 * 
 * @return The [ImageVector] for the PersonLightning icon.
 */
public val FluentIcons.Regular.PersonLightning: ImageVector
    get() {
        if (_personLightning != null) {
            return _personLightning!!
        }
        _personLightning = Builder(name = "PersonLightning", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
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
                lineTo(11.752f, 11.0f)
                lineTo(11.335f, 12.0f)
                lineTo(5.009f, 12.0f)
                curveTo(4.448f, 12.0f, 4.0f, 12.447f, 4.0f, 13.0f)
                curveTo(4.0f, 14.309f, 4.622f, 15.284f, 5.673f, 15.953f)
                curveTo(6.743f, 16.636f, 8.265f, 17.0f, 10.0f, 17.0f)
                lineTo(11.971f, 17.0f)
                lineTo(11.752f, 17.877f)
                curveTo(11.188f, 17.959f, 10.601f, 18.0f, 10.0f, 18.0f)
                curveTo(8.145f, 18.0f, 6.417f, 17.614f, 5.135f, 16.797f)
                curveTo(3.833f, 15.966f, 3.0f, 14.691f, 3.0f, 13.0f)
                close()
                moveTo(12.612f, 16.0f)
                curveTo(12.937f, 16.0f, 13.176f, 16.306f, 13.097f, 16.621f)
                lineTo(12.663f, 18.359f)
                curveTo(12.542f, 18.842f, 13.125f, 19.186f, 13.489f, 18.846f)
                lineTo(18.361f, 14.298f)
                curveTo(18.859f, 13.834f, 18.53f, 13.0f, 17.85f, 13.0f)
                horizontalLineTo(17.446f)
                curveTo(17.105f, 13.0f, 16.864f, 12.666f, 16.972f, 12.342f)
                lineTo(17.533f, 10.658f)
                curveTo(17.641f, 10.334f, 17.4f, 10.0f, 17.059f, 10.0f)
                horizontalLineTo(13.586f)
                curveTo(13.384f, 10.0f, 13.202f, 10.121f, 13.124f, 10.308f)
                lineTo(11.041f, 15.308f)
                curveTo(10.904f, 15.637f, 11.146f, 16.0f, 11.502f, 16.0f)
                horizontalLineTo(12.612f)
                close()
            }
        }
        .build()
        return _personLightning!!
    }

@Suppress("ObjectPropertyName")
private var _personLightning: ImageVector? = null

@Preview
@Composable
private fun PersonLightningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PersonLightning, contentDescription = "PersonLightning Icon")
    }
}

