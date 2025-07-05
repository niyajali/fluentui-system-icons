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
 * Cone Icon (16dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: fluent-icon, visual studio code
 * - Description: Used to represent a cone.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_cone_16_regular.svg)
 * 
 * @return The [ImageVector] for the Cone icon.
 */
public val FluentIcons.Regular.Cone: ImageVector
    get() {
        if (_cone != null) {
            return _cone!!
        }
        _cone = Builder(name = "Cone", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 15.0f)
                curveTo(5.771f, 15.0f, 2.0f, 14.579f, 2.0f, 13.0f)
                curveTo(2.0f, 12.96f, 2.004f, 12.921f, 2.014f, 12.883f)
                lineTo(2.061f, 12.683f)
                curveTo(2.069f, 12.648f, 2.082f, 12.615f, 2.097f, 12.583f)
                lineTo(7.55f, 1.283f)
                curveTo(7.596f, 1.204f, 7.661f, 1.138f, 7.74f, 1.093f)
                curveTo(7.819f, 1.047f, 7.909f, 1.023f, 8.0f, 1.023f)
                curveTo(8.091f, 1.023f, 8.181f, 1.047f, 8.26f, 1.093f)
                curveTo(8.339f, 1.138f, 8.404f, 1.204f, 8.45f, 1.283f)
                lineTo(13.903f, 12.583f)
                curveTo(13.918f, 12.615f, 13.931f, 12.648f, 13.939f, 12.683f)
                lineTo(13.986f, 12.883f)
                curveTo(13.996f, 12.921f, 14.0f, 12.96f, 14.0f, 13.0f)
                curveTo(14.0f, 14.579f, 10.229f, 15.0f, 8.0f, 15.0f)
                close()
                moveTo(3.01f, 13.019f)
                curveTo(3.207f, 13.36f, 5.035f, 14.0f, 8.0f, 14.0f)
                curveTo(10.94f, 14.0f, 12.763f, 13.371f, 12.988f, 13.009f)
                lineTo(12.979f, 12.971f)
                lineTo(8.0f, 2.651f)
                lineTo(3.01f, 13.019f)
                close()
            }
        }
        .build()
        return _cone!!
    }

@Suppress("ObjectPropertyName")
private var _cone: ImageVector? = null

@Preview
@Composable
private fun ConePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Cone, contentDescription = "Cone Icon")
    }
}

