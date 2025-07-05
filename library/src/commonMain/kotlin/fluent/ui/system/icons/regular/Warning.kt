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
 * Warning Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used as a general warning for tons of scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_warning_24_regular.svg)
 * 
 * @return The [ImageVector] for the Warning icon.
 */
public val FluentIcons.Regular.Warning: ImageVector
    get() {
        if (_warning != null) {
            return _warning!!
        }
        _warning = Builder(name = "Warning", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.999f, 17.0f)
                curveTo(12.999f, 16.448f, 12.552f, 16.001f, 12.001f, 16.001f)
                curveTo(11.449f, 16.001f, 11.002f, 16.448f, 11.002f, 17.0f)
                curveTo(11.002f, 17.552f, 11.449f, 17.999f, 12.001f, 17.999f)
                curveTo(12.552f, 17.999f, 12.999f, 17.552f, 12.999f, 17.0f)
                close()
                moveTo(12.74f, 9.147f)
                curveTo(12.69f, 8.781f, 12.376f, 8.499f, 11.996f, 8.499f)
                curveTo(11.582f, 8.499f, 11.247f, 8.835f, 11.247f, 9.25f)
                lineTo(11.251f, 13.751f)
                lineTo(11.257f, 13.853f)
                curveTo(11.307f, 14.219f, 11.622f, 14.501f, 12.001f, 14.501f)
                curveTo(12.415f, 14.5f, 12.751f, 14.164f, 12.751f, 13.75f)
                lineTo(12.747f, 9.248f)
                lineTo(12.74f, 9.147f)
                close()
                moveTo(13.969f, 3.659f)
                curveTo(13.113f, 2.111f, 10.888f, 2.111f, 10.032f, 3.659f)
                lineTo(2.286f, 17.66f)
                curveTo(1.457f, 19.16f, 2.541f, 21.0f, 4.255f, 21.0f)
                horizontalLineTo(19.746f)
                curveTo(21.46f, 21.0f, 22.545f, 19.16f, 21.715f, 17.66f)
                lineTo(13.969f, 3.659f)
                close()
                moveTo(11.344f, 4.385f)
                curveTo(11.63f, 3.869f, 12.371f, 3.869f, 12.657f, 4.385f)
                lineTo(20.403f, 18.386f)
                curveTo(20.679f, 18.886f, 20.317f, 19.5f, 19.746f, 19.5f)
                horizontalLineTo(4.255f)
                curveTo(3.684f, 19.5f, 3.322f, 18.886f, 3.599f, 18.386f)
                lineTo(11.344f, 4.385f)
                close()
            }
        }
        .build()
        return _warning!!
    }

@Suppress("ObjectPropertyName")
private var _warning: ImageVector? = null

@Preview
@Composable
private fun WarningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Warning, contentDescription = "Warning Icon")
    }
}

