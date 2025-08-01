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
 * CloudDatabase Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon, onedrive, outlook, teams
 * - Description: Used in all stored data scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_cloud_database_20_regular.svg)
 * 
 * @return The [ImageVector] for the CloudDatabase icon.
 */
public val FluentIcons.Regular.CloudDatabase: ImageVector
    get() {
        if (_cloudDatabase != null) {
            return _cloudDatabase!!
        }
        _cloudDatabase = Builder(name = "CloudDatabase", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 3.0f)
                curveTo(12.817f, 3.0f, 14.415f, 4.923f, 14.647f, 7.246f)
                lineTo(14.718f, 7.246f)
                curveTo(16.252f, 7.246f, 17.541f, 8.329f, 17.9f, 9.793f)
                curveTo(17.73f, 9.689f, 17.551f, 9.598f, 17.369f, 9.52f)
                curveTo(17.127f, 9.417f, 16.864f, 9.328f, 16.584f, 9.254f)
                curveTo(16.17f, 8.643f, 15.486f, 8.246f, 14.718f, 8.246f)
                lineTo(14.647f, 8.246f)
                curveTo(14.133f, 8.246f, 13.703f, 7.857f, 13.652f, 7.346f)
                curveTo(13.45f, 5.325f, 12.108f, 4.0f, 10.0f, 4.0f)
                curveTo(7.886f, 4.0f, 6.551f, 5.316f, 6.348f, 7.345f)
                curveTo(6.297f, 7.857f, 5.867f, 8.246f, 5.353f, 8.246f)
                lineTo(5.282f, 8.246f)
                curveTo(4.028f, 8.246f, 3.0f, 9.304f, 3.0f, 10.623f)
                curveTo(3.0f, 11.942f, 4.028f, 13.0f, 5.282f, 13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(5.282f)
                curveTo(3.469f, 14.0f, 2.0f, 12.488f, 2.0f, 10.623f)
                curveTo(2.0f, 8.82f, 3.373f, 7.347f, 5.102f, 7.251f)
                lineTo(5.353f, 7.246f)
                curveTo(5.587f, 4.908f, 7.183f, 3.0f, 10.0f, 3.0f)
                close()
                moveTo(17.471f, 14.283f)
                curveTo(16.661f, 14.745f, 15.608f, 15.0f, 14.5f, 15.0f)
                curveTo(13.392f, 15.0f, 12.339f, 14.745f, 11.529f, 14.283f)
                curveTo(11.348f, 14.179f, 11.169f, 14.058f, 11.0f, 13.92f)
                verticalLineTo(17.0f)
                curveTo(11.0f, 18.105f, 12.567f, 19.0f, 14.5f, 19.0f)
                curveTo(16.433f, 19.0f, 18.0f, 18.105f, 18.0f, 17.0f)
                verticalLineTo(13.92f)
                curveTo(17.831f, 14.058f, 17.652f, 14.179f, 17.471f, 14.283f)
                close()
                moveTo(14.5f, 10.0f)
                curveTo(12.567f, 10.0f, 11.0f, 10.895f, 11.0f, 12.0f)
                curveTo(11.0f, 13.105f, 12.567f, 14.0f, 14.5f, 14.0f)
                curveTo(16.433f, 14.0f, 18.0f, 13.105f, 18.0f, 12.0f)
                curveTo(18.0f, 10.895f, 16.433f, 10.0f, 14.5f, 10.0f)
                close()
            }
        }
        .build()
        return _cloudDatabase!!
    }

@Suppress("ObjectPropertyName")
private var _cloudDatabase: ImageVector? = null

@Preview
@Composable
private fun CloudDatabasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CloudDatabase, contentDescription = "CloudDatabase Icon")
    }
}

