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
 * Gather Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon, visual studio
 * - Description: Used in scenarios of gathering data & other content.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_gather_20_filled.svg)
 * 
 * @return The [ImageVector] for the Gather icon.
 */
public val FluentIcons.Filled.Gather: ImageVector
    get() {
        if (_gather != null) {
            return _gather!!
        }
        _gather = Builder(name = "Gather", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(2.146f, 16.854f)
                curveTo(2.053f, 16.76f, 2.0f, 16.633f, 2.0f, 16.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                curveTo(6.0f, 15.53f, 5.789f, 16.039f, 5.414f, 16.414f)
                curveTo(5.039f, 16.789f, 4.53f, 17.0f, 4.0f, 17.0f)
                horizontalLineTo(2.5f)
                curveTo(2.367f, 17.0f, 2.24f, 16.947f, 2.146f, 16.854f)
                close()
                moveTo(2.5f, 3.0f)
                horizontalLineTo(4.0f)
                curveTo(4.53f, 3.0f, 5.039f, 3.211f, 5.414f, 3.586f)
                curveTo(5.789f, 3.961f, 6.0f, 4.47f, 6.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.5f)
                curveTo(2.0f, 3.367f, 2.053f, 3.24f, 2.146f, 3.146f)
                curveTo(2.24f, 3.053f, 2.367f, 3.0f, 2.5f, 3.0f)
                close()
                moveTo(18.0f, 6.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(8.0f)
                curveTo(14.002f, 7.47f, 14.213f, 6.962f, 14.587f, 6.588f)
                curveTo(14.962f, 6.213f, 15.47f, 6.002f, 16.0f, 6.0f)
                horizontalLineTo(17.5f)
                curveTo(17.633f, 6.0f, 17.76f, 6.053f, 17.854f, 6.146f)
                curveTo(17.947f, 6.24f, 18.0f, 6.367f, 18.0f, 6.5f)
                close()
                moveTo(18.0f, 14.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.0f)
                curveTo(14.002f, 13.53f, 14.213f, 14.038f, 14.587f, 14.413f)
                curveTo(14.962f, 14.787f, 15.47f, 14.998f, 16.0f, 15.0f)
                horizontalLineTo(17.5f)
                curveTo(17.633f, 15.0f, 17.76f, 14.947f, 17.854f, 14.854f)
                curveTo(17.947f, 14.76f, 18.0f, 14.633f, 18.0f, 14.5f)
                close()
                moveTo(10.146f, 11.146f)
                curveTo(10.052f, 11.24f, 9.999f, 11.367f, 9.999f, 11.5f)
                curveTo(9.999f, 11.633f, 10.052f, 11.76f, 10.146f, 11.854f)
                curveTo(10.24f, 11.948f, 10.367f, 12.001f, 10.5f, 12.001f)
                curveTo(10.633f, 12.001f, 10.76f, 11.948f, 10.854f, 11.854f)
                lineTo(12.354f, 10.354f)
                curveTo(12.401f, 10.308f, 12.438f, 10.252f, 12.463f, 10.192f)
                curveTo(12.488f, 10.131f, 12.501f, 10.066f, 12.501f, 10.0f)
                curveTo(12.501f, 9.934f, 12.488f, 9.869f, 12.463f, 9.808f)
                curveTo(12.438f, 9.748f, 12.401f, 9.692f, 12.354f, 9.646f)
                lineTo(10.854f, 8.146f)
                curveTo(10.76f, 8.052f, 10.633f, 7.999f, 10.5f, 7.999f)
                curveTo(10.367f, 7.999f, 10.24f, 8.052f, 10.146f, 8.146f)
                curveTo(10.052f, 8.24f, 9.999f, 8.367f, 9.999f, 8.5f)
                curveTo(9.999f, 8.633f, 10.052f, 8.76f, 10.146f, 8.854f)
                lineTo(10.793f, 9.5f)
                horizontalLineTo(8.0f)
                curveTo(7.867f, 9.5f, 7.74f, 9.553f, 7.646f, 9.646f)
                curveTo(7.553f, 9.74f, 7.5f, 9.867f, 7.5f, 10.0f)
                curveTo(7.5f, 10.133f, 7.553f, 10.26f, 7.646f, 10.354f)
                curveTo(7.74f, 10.447f, 7.867f, 10.5f, 8.0f, 10.5f)
                horizontalLineTo(10.793f)
                lineTo(10.146f, 11.146f)
                close()
            }
        }
        .build()
        return _gather!!
    }

@Suppress("ObjectPropertyName")
private var _gather: ImageVector? = null

@Preview
@Composable
private fun GatherPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Gather, contentDescription = "Gather Icon")
    }
}

