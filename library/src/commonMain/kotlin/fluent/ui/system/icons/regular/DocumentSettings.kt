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
 * DocumentSettings icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: document, settings
 * - Source: ic_fluent_document_settings_20_regular.svg
 * 
 * @return The [ImageVector] for the DocumentSettings icon.
 */
public val FluentIcons.Regular.DocumentSettings: ImageVector
    get() {
        if (_documentSettings != null) {
            return _documentSettings!!
        }
        _documentSettings = Builder(name = "DocumentSettings", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                curveTo(4.895f, 2.0f, 4.0f, 2.895f, 4.0f, 4.0f)
                verticalLineTo(8.207f)
                curveTo(4.322f, 8.116f, 4.657f, 8.053f, 5.0f, 8.022f)
                verticalLineTo(4.0f)
                curveTo(5.0f, 3.448f, 5.448f, 3.0f, 6.0f, 3.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.5f)
                curveTo(10.0f, 7.328f, 10.672f, 8.0f, 11.5f, 8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                curveTo(15.0f, 16.552f, 14.552f, 17.0f, 14.0f, 17.0f)
                horizontalLineTo(9.743f)
                curveTo(9.429f, 17.379f, 9.066f, 17.716f, 8.663f, 18.0f)
                horizontalLineTo(14.0f)
                curveTo(15.105f, 18.0f, 16.0f, 17.105f, 16.0f, 16.0f)
                verticalLineTo(7.414f)
                curveTo(16.0f, 7.016f, 15.842f, 6.635f, 15.561f, 6.354f)
                lineTo(11.646f, 2.439f)
                curveTo(11.365f, 2.158f, 10.984f, 2.0f, 10.586f, 2.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(14.793f, 7.0f)
                horizontalLineTo(11.5f)
                curveTo(11.224f, 7.0f, 11.0f, 6.776f, 11.0f, 6.5f)
                verticalLineTo(3.207f)
                lineTo(14.793f, 7.0f)
                close()
                moveTo(3.065f, 10.442f)
                curveTo(3.368f, 11.523f, 2.722f, 12.642f, 1.634f, 12.92f)
                lineTo(1.173f, 13.038f)
                curveTo(1.158f, 13.19f, 1.15f, 13.344f, 1.15f, 13.5f)
                curveTo(1.15f, 13.688f, 1.161f, 13.873f, 1.183f, 14.054f)
                lineTo(1.533f, 14.137f)
                curveTo(2.652f, 14.401f, 3.318f, 15.554f, 2.989f, 16.656f)
                lineTo(2.862f, 17.079f)
                curveTo(3.12f, 17.282f, 3.399f, 17.456f, 3.697f, 17.596f)
                lineTo(4.022f, 17.252f)
                curveTo(4.812f, 16.416f, 6.143f, 16.417f, 6.932f, 17.254f)
                lineTo(7.269f, 17.612f)
                curveTo(7.561f, 17.477f, 7.837f, 17.309f, 8.091f, 17.114f)
                lineTo(7.935f, 16.558f)
                curveTo(7.631f, 15.476f, 8.277f, 14.358f, 9.365f, 14.08f)
                lineTo(9.826f, 13.962f)
                curveTo(9.841f, 13.81f, 9.848f, 13.656f, 9.848f, 13.5f)
                curveTo(9.848f, 13.312f, 9.837f, 13.127f, 9.816f, 12.945f)
                lineTo(9.467f, 12.863f)
                curveTo(8.347f, 12.598f, 7.681f, 11.446f, 8.011f, 10.344f)
                lineTo(8.137f, 9.921f)
                curveTo(7.88f, 9.718f, 7.6f, 9.544f, 7.302f, 9.403f)
                lineTo(6.977f, 9.747f)
                curveTo(6.188f, 10.583f, 4.857f, 10.583f, 4.068f, 9.746f)
                lineTo(3.73f, 9.388f)
                curveTo(3.438f, 9.523f, 3.163f, 9.69f, 2.909f, 9.885f)
                lineTo(3.065f, 10.442f)
                close()
                moveTo(5.499f, 14.5f)
                curveTo(4.947f, 14.5f, 4.499f, 14.052f, 4.499f, 13.5f)
                curveTo(4.499f, 12.948f, 4.947f, 12.5f, 5.499f, 12.5f)
                curveTo(6.052f, 12.5f, 6.499f, 12.948f, 6.499f, 13.5f)
                curveTo(6.499f, 14.052f, 6.052f, 14.5f, 5.499f, 14.5f)
                close()
            }
        }
        .build()
        return _documentSettings!!
    }

@Suppress("ObjectPropertyName")
private var _documentSettings: ImageVector? = null

@Preview
@Composable
private fun DocumentSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentSettings, contentDescription = null)
    }
}

