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
 * SearchSettings Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in general search scenarios.â ï¸ Please note, Fluent updates have pushed for unified direction. So no more right leaning magnifying glasses, mmmkay?
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_search_settings_20_regular.svg)
 * 
 * @return The [ImageVector] for the SearchSettings icon.
 */
public val FluentIcons.Regular.SearchSettings: ImageVector
    get() {
        if (_searchSettings != null) {
            return _searchSettings!!
        }
        _searchSettings = Builder(name = "SearchSettings", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.729f, 13.436f)
                curveTo(12.216f, 13.876f, 11.633f, 14.238f, 11.0f, 14.502f)
                lineTo(11.0f, 14.5f)
                curveTo(11.0f, 14.141f, 10.966f, 13.79f, 10.9f, 13.45f)
                curveTo(11.303f, 13.254f, 11.679f, 13.011f, 12.02f, 12.727f)
                curveTo(12.276f, 12.513f, 12.513f, 12.276f, 12.726f, 12.02f)
                curveTo(13.522f, 11.066f, 14.0f, 9.839f, 14.0f, 8.5f)
                curveTo(14.0f, 5.462f, 11.538f, 3.0f, 8.5f, 3.0f)
                curveTo(5.462f, 3.0f, 3.0f, 5.462f, 3.0f, 8.5f)
                curveTo(3.0f, 8.859f, 3.034f, 9.21f, 3.1f, 9.55f)
                curveTo(2.781f, 9.705f, 2.479f, 9.89f, 2.199f, 10.101f)
                curveTo(2.069f, 9.589f, 2.0f, 9.052f, 2.0f, 8.5f)
                curveTo(2.0f, 4.91f, 4.91f, 2.0f, 8.5f, 2.0f)
                curveTo(12.09f, 2.0f, 15.0f, 4.91f, 15.0f, 8.5f)
                curveTo(15.0f, 10.115f, 14.411f, 11.592f, 13.436f, 12.729f)
                lineTo(16.854f, 16.146f)
                curveTo(17.049f, 16.342f, 17.049f, 16.658f, 16.854f, 16.854f)
                curveTo(16.68f, 17.027f, 16.41f, 17.046f, 16.216f, 16.911f)
                lineTo(16.146f, 16.854f)
                lineTo(12.729f, 13.436f)
                close()
                moveTo(3.067f, 11.442f)
                curveTo(3.37f, 12.523f, 2.724f, 13.642f, 1.636f, 13.92f)
                lineTo(1.175f, 14.038f)
                curveTo(1.16f, 14.19f, 1.152f, 14.344f, 1.152f, 14.5f)
                curveTo(1.152f, 14.688f, 1.163f, 14.873f, 1.185f, 15.054f)
                lineTo(1.535f, 15.137f)
                curveTo(2.654f, 15.401f, 3.32f, 16.554f, 2.991f, 17.656f)
                lineTo(2.864f, 18.079f)
                curveTo(3.121f, 18.282f, 3.401f, 18.456f, 3.699f, 18.596f)
                lineTo(4.024f, 18.252f)
                curveTo(4.814f, 17.416f, 6.145f, 17.417f, 6.933f, 18.254f)
                lineTo(7.271f, 18.612f)
                curveTo(7.563f, 18.477f, 7.839f, 18.309f, 8.093f, 18.114f)
                lineTo(7.937f, 17.558f)
                curveTo(7.633f, 16.476f, 8.279f, 15.358f, 9.367f, 15.08f)
                lineTo(9.828f, 14.962f)
                curveTo(9.843f, 14.81f, 9.85f, 14.656f, 9.85f, 14.5f)
                curveTo(9.85f, 14.312f, 9.839f, 14.127f, 9.818f, 13.945f)
                lineTo(9.469f, 13.863f)
                curveTo(8.349f, 13.598f, 7.683f, 12.446f, 8.013f, 11.344f)
                lineTo(8.139f, 10.922f)
                curveTo(7.882f, 10.718f, 7.602f, 10.544f, 7.304f, 10.403f)
                lineTo(6.979f, 10.747f)
                curveTo(6.189f, 11.583f, 4.859f, 11.583f, 4.07f, 10.746f)
                lineTo(3.732f, 10.388f)
                curveTo(3.44f, 10.523f, 3.165f, 10.69f, 2.911f, 10.885f)
                lineTo(3.067f, 11.442f)
                close()
                moveTo(5.501f, 15.5f)
                curveTo(4.949f, 15.5f, 4.501f, 15.052f, 4.501f, 14.5f)
                curveTo(4.501f, 13.948f, 4.949f, 13.5f, 5.501f, 13.5f)
                curveTo(6.054f, 13.5f, 6.501f, 13.948f, 6.501f, 14.5f)
                curveTo(6.501f, 15.052f, 6.054f, 15.5f, 5.501f, 15.5f)
                close()
            }
        }
        .build()
        return _searchSettings!!
    }

@Suppress("ObjectPropertyName")
private var _searchSettings: ImageVector? = null

@Preview
@Composable
private fun SearchSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SearchSettings, contentDescription = "SearchSettings Icon")
    }
}

