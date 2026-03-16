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

package fluent.ui.system.icons.light

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
 * PeopleCheckmark Icon (32dp)
 * 
 * **Icon details:**
 * - Style: Light
 * - Size: 32dp
 * - Keywords: fluent-icon
 * - Description: Used in a wide range of scenarios - representing a general group, contacts, contact lists, sharing, and managing access.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_people_checkmark_32_light.svg)
 * 
 * @return The [ImageVector] for the PeopleCheckmark icon.
 */
public val FluentIcons.Light.PeopleCheckmark: ImageVector
    get() {
        if (_peopleCheckmark != null) {
            return _peopleCheckmark!!
        }
        _peopleCheckmark = Builder(name = "PeopleCheckmark", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.0f, 16.5f)
                curveTo(27.142f, 16.5f, 30.5f, 19.858f, 30.5f, 24.0f)
                curveTo(30.5f, 28.142f, 27.142f, 31.5f, 23.0f, 31.5f)
                curveTo(18.858f, 31.5f, 15.5f, 28.142f, 15.5f, 24.0f)
                curveTo(15.5f, 19.858f, 18.858f, 16.5f, 23.0f, 16.5f)
                close()
                moveTo(27.53f, 21.22f)
                curveTo(27.237f, 20.927f, 26.763f, 20.927f, 26.47f, 21.22f)
                lineTo(21.75f, 25.94f)
                lineTo(19.78f, 23.97f)
                curveTo(19.487f, 23.677f, 19.013f, 23.677f, 18.72f, 23.97f)
                curveTo(18.427f, 24.263f, 18.427f, 24.737f, 18.72f, 25.03f)
                lineTo(21.22f, 27.53f)
                curveTo(21.513f, 27.823f, 21.987f, 27.823f, 22.28f, 27.53f)
                lineTo(27.53f, 22.28f)
                curveTo(27.823f, 21.987f, 27.823f, 21.513f, 27.53f, 21.22f)
                close()
                moveTo(16.0f, 17.0f)
                curveTo(16.387f, 17.0f, 16.757f, 17.074f, 17.097f, 17.207f)
                curveTo(16.806f, 17.46f, 16.531f, 17.731f, 16.275f, 18.019f)
                curveTo(16.185f, 18.006f, 16.093f, 18.0f, 16.0f, 18.0f)
                horizontalLineTo(5.0f)
                curveTo(3.895f, 18.0f, 3.0f, 18.895f, 3.0f, 20.0f)
                curveTo(3.0f, 20.884f, 3.333f, 22.12f, 4.406f, 23.137f)
                curveTo(5.476f, 24.15f, 7.339f, 25.0f, 10.5f, 25.0f)
                curveTo(11.918f, 25.0f, 13.075f, 24.829f, 14.017f, 24.549f)
                curveTo(14.037f, 24.89f, 14.076f, 25.226f, 14.134f, 25.556f)
                curveTo(13.121f, 25.837f, 11.919f, 26.0f, 10.5f, 26.0f)
                curveTo(7.161f, 26.0f, 5.024f, 25.1f, 3.719f, 23.863f)
                curveTo(2.417f, 22.63f, 2.0f, 21.116f, 2.0f, 20.0f)
                curveTo(2.0f, 18.343f, 3.343f, 17.0f, 5.0f, 17.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(10.5f, 4.0f)
                curveTo(13.538f, 4.0f, 16.0f, 6.462f, 16.0f, 9.5f)
                curveTo(16.0f, 12.538f, 13.538f, 15.0f, 10.5f, 15.0f)
                curveTo(7.462f, 15.0f, 5.0f, 12.538f, 5.0f, 9.5f)
                curveTo(5.0f, 6.462f, 7.462f, 4.0f, 10.5f, 4.0f)
                close()
                moveTo(23.0f, 7.0f)
                curveTo(25.209f, 7.0f, 27.0f, 8.791f, 27.0f, 11.0f)
                curveTo(27.0f, 13.209f, 25.209f, 15.0f, 23.0f, 15.0f)
                curveTo(20.791f, 15.0f, 19.0f, 13.209f, 19.0f, 11.0f)
                curveTo(19.0f, 8.791f, 20.791f, 7.0f, 23.0f, 7.0f)
                close()
                moveTo(10.5f, 5.0f)
                curveTo(8.015f, 5.0f, 6.0f, 7.015f, 6.0f, 9.5f)
                curveTo(6.0f, 11.985f, 8.015f, 14.0f, 10.5f, 14.0f)
                curveTo(12.985f, 14.0f, 15.0f, 11.985f, 15.0f, 9.5f)
                curveTo(15.0f, 7.015f, 12.985f, 5.0f, 10.5f, 5.0f)
                close()
                moveTo(23.0f, 8.0f)
                curveTo(21.343f, 8.0f, 20.0f, 9.343f, 20.0f, 11.0f)
                curveTo(20.0f, 12.657f, 21.343f, 14.0f, 23.0f, 14.0f)
                curveTo(24.657f, 14.0f, 26.0f, 12.657f, 26.0f, 11.0f)
                curveTo(26.0f, 9.343f, 24.657f, 8.0f, 23.0f, 8.0f)
                close()
            }
        }
        .build()
        return _peopleCheckmark!!
    }

@Suppress("ObjectPropertyName")
private var _peopleCheckmark: ImageVector? = null

@Preview
@Composable
private fun PeopleCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.PeopleCheckmark, contentDescription = "PeopleCheckmark Icon")
    }
}

